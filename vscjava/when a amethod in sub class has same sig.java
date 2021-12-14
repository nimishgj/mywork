when a amethod in sub class has same signature as a method in super class,
the method in sub class is said to overide a method in a super class

class Cuboid extends Rectangle{
    double height;
    public Cuboid(double height,double width, double length){
        super(width,length); 
        this.height=height;
    }
    public double computeArea() {
        return(2*(length*width+height*length+height*width));
    }
    public double computePeri() {
        return(2*(length+height+width));
    }
    public double computeVolume() {
        return(length*height*width);
    }
}



Cuboid c1= new Cuboid(1,2,3);
System.out.println("Area of Cuboid : "+c1.computeArea()); 
System.out.println("Perimeter of Cuboid : "+c1.computePeri()); 
System.out.println("Volume of Cuboid : "+c1.computeVolume());