public class CircleComparator implements Comparator<Circle>{
    @Override
    public String compare(Circle a, Circle b){
        if(a.getRadius()>b.getRadius()){
            return "circle " +a.getName() + " greater than"  +" circle " + b.getName();
        }else if(a.getRadius()==b.getRadius()){
            return "circle " +a.getName() + " equals " + b.getName() +" circle ";
        }else{
            return "circle " +a.getName() + " lesser than" + b.getName() +" circle ";
        }

    }
}
