javac FruitBuyer.java
javac FruitSeller.java

md orange
md orange.\seller
md orange.\buyer

move FruitBuyer.class .\orange\buyer\FruitBuyer.class
move FruitSeller.class .\orange\seller\FruitSeller.class

javac FruitSalesMain3.java
java FruitSalesMain3
pause