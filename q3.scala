object Sal{
def  main(args:Array[String]):Unit={
var S=total(40,30)
 var lastS = S-(S*.12)
print("Take home salary=")
println(lastS)
}

def normal(n:Int)={
250*n
}

def ot(o:Int)={
85*o
}

def total(x:Int,y:Int)={
normal(x)+ot(y)
}

}