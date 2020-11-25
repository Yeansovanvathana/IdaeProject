package assignment.scala
import java.util.{Scanner, Stack}
import java.util

object queues_a_tale_of_two_stacks {

  private class MyQueue[T] {
    private val in = new util.Stack[T]
    private val out = new util.Stack[T]

    def enqueue(item: T): Unit = {
      in.push(item)
    }
    def dequeue: T = {
      if (out.isEmpty) while ( {
        !in.empty
      }) out.push(in.pop)
      out.pop
    }
    def peek: T = {
      if (out.isEmpty) while ( {
        !in.empty
      }) out.push(in.pop)
      out.peek
    }
  }
  def main(args: Array[String]): Unit = {
    val queue = new queues_a_tale_of_two_stacks.MyQueue[Integer]
    val scan = new Scanner(System.in)
    val n = scan.nextInt
    for (i <- 0 until n) {
      val operation = scan.nextInt
      if (operation == 1) {
        queue.enqueue(scan.nextInt)
      }
      else if (operation == 2) {
        queue.dequeue
      }
      else if (operation == 3) {
        System.out.println(queue.peek)
      }
    }
    scan.close()
  }
}

