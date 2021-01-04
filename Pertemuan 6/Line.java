public class Line{

 	private Point begin;
 	private Point end;

 	public Line(int x1, int y1, int x2, int y2){
 		begin = new Point(x1, y1);
 		end = new Point(x2, y2);
 	}

 	public Line(Point begin, Point end){
 		this.begin = begin;
 		this.end = end;
 	}

 	public Point getBegin(){
 		return begin;
	}

 	public void setBegin(Point begin){
 		this.begin = begin;
 	}

 	public Point getEnd(){
 		return end;
 	}

 	public void setEnd(Point end){
 		this.end = end;
 	}

    public int getBeginX(){
        return begin.getX();
    }
    
    public void setBeginX(int x){
        begin.setX(x);
    }
    
    public int getBeginY(){
        return begin.getY();
    } 

    public void setBeginY(int y){
        begin.setY(y);
    }
    
    public void setBeginXY(int x , int y){
        begin.setX(x);
        begin.setY(y);
    }
   
    public int getEndX(){
        return end.getY();
    }
    
    public void setEndX(int x){
        end.setX(x);
    }
    
    public int getEndY(){
        return end.getY();
    }
    
	public void setEndY(int y){
       	end.setY(y);
    }
    
	public void setEndXY(int x, int y){
      	end.setX(x);
       	end.setY(y);
    }
    
   	public String toString(){
       	return "Garis dengan titik 1 = "+ begin.toString() + "titik 2 ="+ end.toString();
    }
    
   // Untuk mencari nilai panjang garis
   	public double getLength(){
       	return Math.sqrt((( (begin.getX()-end.getX())*(begin.getX()-end.getX())) + ((begin.getY()-end.getY())*(begin.getY()-end.getY())) ));
    
    }
}