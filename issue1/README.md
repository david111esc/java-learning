# [Issue 1] Object reference problems

## Problems
對於物件在程式執行中被引用的問題
### 1.針對物件
1) 物件之間 " == ", ".equals()"
```java
String A = new String("111");
String B = A;
String C = "111"; 
```
2) 指向 null 的疑問
```java
Object A = new Object();
Object B = A;
A = null;
```
3) 更改物件
```java
Integer A = new Integer();
Integer B = A;
A = A + 1;
```
4) 針對 class 成員改動
```java
public class Bag{
    Integer fruitNumber;
    public Bag();
    public Bag(Integer fruitNumber);
    public Integer getFruitNumber();
    public void setFruitNumber(Integer fruitNumber);
    public void addFruitNumber(Integer add);
}
Bag A = new Bag(3);
Bag B = A;
A.setFruitNumber(5);
B.getFruitNumber();
```

### 2.List 疑問
1) 針對 class 本身改動
```java
LinkedList<String> list = new LinkedList<String>();
String one = "one";
String two = "two";
list.add(one);
list.add(two);
one = "three";
```
2) 針對 class 成員改動
```java
public class Bag{
    Integer fruitNumber;
    public Bag();
    public Bag(Integer fruitNumber);
    public Integer getFruitNumber();
    public void setFruitNumber(Integer fruitNumber);
    public void addFruitNumber(Integer add);
}
LinkedList<Bag> list = new LinkedList<Bag>();
Bag myBag = new Bag();
myBag.setFruitNumber(3);
list.add(myBag);
myBag.addFruitNumber(2);
```
