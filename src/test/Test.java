package test;

import java.io.IOException;

import com.ansj.vec.Word2VEC;

public class Test {
    public static void main(String[] args) throws IOException {
        Word2VEC w1 = new Word2VEC() ;
        w1.loadGoogleModel("library/output.bin") ;
        
        System.out.println(w1.distance("巴西"));
        
        System.out.println(w1.distance("世界杯"));
        
        System.out.println(w1.distance("男人"));
        
        
        System.out.println(w1.distance("英格兰"));
        
    }
}
