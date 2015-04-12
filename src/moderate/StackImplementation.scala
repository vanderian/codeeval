package moderate

/**
 * Created by vander on 3/16/15.
 */
object StackImplementation extends App {
  val lines = "1 2 3 4\n10 -2 3 4 6".split("\n").iterator

  class Stack[+A](self: List[A]) {
    def top: A = self.head
    def rest: Stack[A] = new Stack(self.tail)
    def isEmpty: Boolean = self.isEmpty
    def pop: (A, Stack[A]) = (top, rest)
    def push[B >: A](x: B): Stack[B] = new Stack(x :: self)
    def length: Int = self.length
  }

  object Stack {
    def empty[A]: Stack[A] = new Stack(Nil)
    def apply[A](xs: A*): Stack[A] = {
      var r: Stack[A] = Stack.empty
      for (x <- xs) r = r.push(x)
      r
    }
    def fromSeq[A](xs: Seq[A]): Stack[A] = {
      var r: Stack[A] = Stack.empty
      for (x <- xs) r = r.push(x)
      r
    }
  }

  def process(s: String): String = {
    val sp = s.split(" ").map(_.toInt)
    var stack = Stack.fromSeq(sp)
    val a = scala.collection.mutable.ArrayBuffer.empty[Int]
    while (!stack.isEmpty) {
      a.append(stack.top)
      stack = stack.pop._2
    }

    Range(0, a.length, 2).map(a(_)).mkString(" ")
  }

  print(lines.map(process).mkString("\n"))
}