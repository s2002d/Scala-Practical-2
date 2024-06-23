object Tick{
def main(args:Array[String]):Unit={

print("Profit for Decrease attendence-")
decreaseprice(20)
print("Profit for Increase attendence-")
increaseprice(20)

}

def  decreaseprice(a:Int)={
var C = (120+a)*(15-5 )
var d = C-(500+(3*(120+a)))
println(d)

}

def  increaseprice(b:Int)={
var c= (120-b)*(15+5 )
var i = c-(500+(3*(120-b)))
println(i)
}










}