
import scala.io.StdIn
object Q1 {
  def interest (amount: Int) : Double = {
   amount match {
 case x if x<0 => 0
  case x if x<=20000 => x*0.02
  case x if x<=200000 => x*.04
  case x if x<=2000000 => x*.035
 case x if x>2000000 => x*.065
  }
  }

  def main (args : Array [String]) : Unit = {
    print("Enter the deposit amount :");
    
    var n=StdIn.readInt();
    

    var value=interest(n);
    printf ("The interest earned :%f ",value);
  }
}