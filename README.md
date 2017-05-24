# lab1
Лабораторная работа 1
public class Point2d 
{
 
 /** X координата точки **/
 	private double xCoord;
 
 /** Y координата точки **/
 	private double yCoord;

 /** Конструктор для инициализации точка (X, Y) значение. **/
 	public Point2d(double x, double y) 
 	{
 		xCoord = x;
 		yCoord = y;
 	}

 /** Конструктор без аргументов: по умолчанию точка. **/
 	public Point2d() 
 	{
 // Называть двух-аргумент конструктора и указывать источник.
 		this(0, 0);
 	}

 /** Возвращает x координат точки. **/
 	public double getX() {
 	return xCoord;
 	}

 /** Возвращает X координат точки. **/
 	public double getY() 
 	{
 		return yCoord;
 	}

 /** Набор X-координата точки. **/
 	public void setX(double val) 
 	{
 		xCoord = val;
 	}

 /** Набор Y-координата точки. **/
 	public void setY(double val) 
 	{
 		yCoord = val;
 	}
}
