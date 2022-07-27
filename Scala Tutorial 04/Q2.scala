object Q2 extends App{

 case class ShoppingCartItem(name: String, price: Double, qtyBought: Int) //case class for shopping cart

 val item1 = ShoppingCartItem("vanilla ice cream", 2.99, 10)
 val item2 = ShoppingCartItem("chocolate biscuits", 3.99, 3)
 val item3 = ShoppingCartItem("cupcakes", 4.99, 5)
 val basket = List(item1, item2, item3)

 def printCartItems(basket: List[ShoppingCartItem]): Unit = {
   basket.foreach { item =>
     println(s"${item.qtyBought} ${item.name} at $$${item.price} each") //s is used for string interpollator 
   }
 }

printCartItems(basket)


 def printIceCream(basket: List[ShoppingCartItem]): Unit = {
   basket.foreach { {
     case ShoppingCartItem("vanilla ice cream", _, _) => println(s"Found a vanilla ice cream item.")
     case ShoppingCartItem(_,_,_) => println("Found another item.")
     }
   }
 }

 printIceCream(basket)

}
