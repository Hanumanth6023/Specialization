import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrayStream{

    public static void main(String[] args){

        List<Integer> nos = Arrays.asList(11,4,3,22,33,45,75);

        List<Integer> cube_of_nos = nos.stream().map(i -> i*i*i)
                        .collect(Collectors.toList());
        
        System.out.println(cube_of_nos);

        
    }
}