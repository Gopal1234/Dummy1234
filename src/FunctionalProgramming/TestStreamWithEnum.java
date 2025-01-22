package FunctionalProgramming;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

enum SortMethod
{
//0, 1
BYNAME,BYPRICE;
}
class Product
{
private int pId;
private String pName;
private double pPrice;
public Product(int pId, String pName, double pPrice) {
super();
this.pId = pId;
this.pName = pName;
this.pPrice = pPrice;
}
public int getpId() {
return pId;
}
public void setpId(int pId) {
this.pId = pId;
}
public String getpName() {
return pName;
}
public void setpName(String pName) {
this.pName = pName;
}
public double getpPrice() {
return pPrice;
}
public void setpPrice(double pPrice) {
this.pPrice = pPrice;
}
public Product() {
super();
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
}



}
/*
 *
 * valid type-primitive type,class, interface, collection, map, enum type
 *
 *
 */
class ProductBO
{

public  static Stream<Product> getSortedProduct
(List<Product> listOfProducts, SortMethod sort)
{

String sortMethods= sort.name();
//System.out.println(sortMethods);

//System.out.println(sort.ordinal());
if(sortMethods.equalsIgnoreCase("byname"))
{
Comparator<Product> sortProductByName=(p1,p2)-> p1.getpName().
compareTo(p2.getpName())>1 ? 1:-1;
return listOfProducts.stream().sorted(sortProductByName);
}else if(sortMethods.equals("BYPRICE"))
{
Comparator<Product> sortProductByPrice=(p1,p2)-> 
p1.getpPrice()< p2.getpPrice() ? 1:-1;
return listOfProducts.stream().sorted(sortProductByPrice);
}


return null;
}

}



public class TestStreamWithEnum {

public static void main(String[] args) {
  List<Product> products=new ArrayList<Product>();
products.add(new Product(1, "ABC", 457.00));
products.add(new Product(2, "XYZ", 657.00));
products.add(new Product(5, "TBC", 957.00));
products.add(new Product(8, "GBC", 57.00));
products.add(new Product(9, "Ay", 857.00));

  Stream<Product> s1=   ProductBO.
		  getSortedProduct(products, SortMethod.BYNAME);
s1.forEach(p->System.out.println(p.getpId() + " "+p.getpName() + " "+p.getpPrice()));

}

}
