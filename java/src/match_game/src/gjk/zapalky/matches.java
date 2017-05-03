package gjk.zapalky;

import java.awt.Point;
import java.util.*;

public class matches implements gjk.zapalky.IHrac{
    private Random generator = new Random();
    private boolean [][] plan;
    private List<Point> list = new ArrayList<>();
    private List<Point> originalList = new ArrayList<>();
    public String Jmeno(){
        return "Fořt";
    }


    public void Inicializace(int N){
        plan = new boolean [N*2+1][];
        for(int i=0; i<=N*2;i++){
            if(i%2==0){
                plan[i] = new boolean[N];
            }
            else{
                plan[i] = new boolean[N+1];
            }
            for(int ii=0; ii<plan[i].length;ii++){
                plan[i][ii]=false;
                list.add(new Point(ii, i));
            }
        }
        originalList = list;
        Collections.shuffle(list);
    }
    public void TahProtihrace(Point souradnice){
        System.out.println(souradnice);
        try {
            if(plan[(int)souradnice.getY()][(int)souradnice.getX()]){
                throw new IllegalArgumentException("Souřadnice Zabraná");
            }
            else{
                plan[(int)souradnice.getY()][(int)souradnice.getX()] = true;
                list.remove(souradnice);

            }
        }
        catch (Exception e){
            throw new IllegalArgumentException("Souřadnice není v poli" + e);
        }
    }

    private boolean checkPointIsInList(Point souradnice) {
        return (!list.contains(souradnice)) && originalList.contains(souradnice);
    }

    private boolean checkPointIsNotInList(Point souradnice) {
        return list.contains(souradnice) && originalList.contains(souradnice);
    }

    private List<Point> createSurroundingPoints(Point w) {
        List<Point> surroundingPoints = new ArrayList<>();
        surroundingPoints.add(new Point((int)w.getX(),(int)w.getY()+1)); //0
        surroundingPoints.add(new Point((int)w.getX()+1,(int)w.getY()+1)); //1
        surroundingPoints.add(new Point((int)w.getX(),(int)w.getY()+2)); //2
        surroundingPoints.add(new Point((int)w.getX(),(int)w.getY()-2)); //3
        surroundingPoints.add(new Point((int)w.getX(),(int)w.getY()-1)); //4
        surroundingPoints.add(new Point((int)w.getX()-1,(int)w.getY()-1)); //5
        surroundingPoints.add(new Point((int)w.getX()-1,(int)w.getY()));  //6
        surroundingPoints.add(new Point((int)w.getX()-1,(int)w.getY()+1));//7
        surroundingPoints.add(new Point((int)w.getX()+1,(int)w.getY()-1));//8
        return surroundingPoints;
    }

    public Point MujTah(){
        for(Point w:list){
            //Tři sirky
            List<Point> surroundingPoints = createSurroundingPoints(w);
            if(checkPointIsInList(surroundingPoints.get(0)) && checkPointIsInList(surroundingPoints.get(1)) && checkPointIsInList(surroundingPoints.get(2))) {
                list.remove(w);
                return w;
            }
            else if (checkPointIsInList(surroundingPoints.get(0)) && checkPointIsInList(surroundingPoints.get(1)) && checkPointIsInList(surroundingPoints.get(4))){
                list.remove(w);
                return w;
            }
            else if (checkPointIsInList(surroundingPoints.get(5)) && checkPointIsInList(surroundingPoints.get(6)) && checkPointIsInList(surroundingPoints.get(0))) {
                list.remove(w);
                return w;
            }
            else if (checkPointIsInList(surroundingPoints.get(3)) && checkPointIsInList(surroundingPoints.get(4)) && checkPointIsInList(surroundingPoints.get(8))) {
                list.remove(w);
                return w;
            }
        }

        while(true){



            int y = generator.nextInt(plan.length);
            int x = generator.nextInt(plan[y].length);
            //System.out.println(x);
            //System.out.println(y);
            if(!plan[y][x]){
                plan[y][x] = true;
                list.remove(new Point(x,y));
                return(new Point(x, y));
            }

        }
    }
}