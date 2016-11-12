package org.egc;
import org.apache.log4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log=Logger.getLogger(App.class);
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int multiplica(int a, int b)
    {
        log.info("Multiplicando");
        return (a / b);
    }
}

 
