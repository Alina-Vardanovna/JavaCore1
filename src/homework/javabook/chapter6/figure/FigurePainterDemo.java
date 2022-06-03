package homework.javabook.chapter6.figure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.security.rsa.RSAUtil;

public class FigurePainterDemo {

    public static void main(String[] args) {

        FigurePainter fp = new FigurePainter ();
        fp.figure1(3);
        fp.c = '☆' ;
        fp.figure2(2);
        fp.figure3();

        FigurePainter fp2 = new FigurePainter();
        fp2.figure1(9);


    }
}
