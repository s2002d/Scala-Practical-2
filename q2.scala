object Exp{
def main(args:Array[String]):Unit={

var a: Int = 2
var b: Int = 3
var c: Int = 4
var d: Int = 5
var k: Float = 4.3f

print("(1)println( - -b * a + c *d - -)= ")
b -=1
println(b*a+c*d)
d-=1

print("(2)println(a++)= ")
println(a)
a += 1
print("(3)println (-2 * ( g-k ) +c) = ")
println(-2*(d-k)+c)

c=c+1
print("(4)println (c=c++)=")
println(c)

c+=1
print("(5)println (c=++c*a++)= ")
c=c*a
println(c)
a += 1

} 
} 
