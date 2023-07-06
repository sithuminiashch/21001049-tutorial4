
import scala.io.StdIn
object Q2 {
  def patternMatching (n: Int) : String = {
   n match {
 case x if (x<0 || x==0)=>"Negative/Zero is input"
  case x if (x%2)==0 => "Even number is given"
  case x if  (x%2)!=0 => "Odd number is given"
  
  }
  }

  def main (args : Array [String]) : Unit = {
    print("Input a number :");
    
    var n=StdIn.readInt();
    

   
    print (patternMatching(n));
}
}