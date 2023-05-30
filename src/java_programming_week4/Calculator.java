package java_programming_week4;

public class Calculator
{
Floor floor;
Carpet carpet;
public Calculator(Floor floor,Carpet carpet)
{
    this.floor=floor;
    this.carpet=carpet;
}
public double getTotalCost()
{
    double v= carpet.getCost()*floor.getArea();
    return (v);
}
}
