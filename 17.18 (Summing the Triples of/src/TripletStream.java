public class TripletStream{

public static void main(String[] args) throws Exception {

int sum = java.util.stream.IntStream.rangeClosed(1,10).

map(

x -> {

if(x % 2 == 0)

return x * 3;

return 0;

}

).sum();

System.out.println("Sum of the triples of the even ints from 2 to 10 is : "+sum);

}

}