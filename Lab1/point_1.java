
//import java.util.scanner;
class Point{
 private double x;
 private double y;

 public Point(double x,double y){

     this.x=x;
     this.y=y;
 
 
 }

public Point(double x){
this.x=x;
}

 public void setX(double x){
 this.x=x;
 
 }



 public void setY(double y){
 this.y=y;
 
 }

public double  getX(){
return x;
}
    
public double  getY(){

return y;

}


@Override
public String toString(){

return "(" + x +", " +y+")";

}
    

    







}
