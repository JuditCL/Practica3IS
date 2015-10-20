package practica3;

public class Practica3 {

    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("hotmail..com");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        HistogramDisplay histograma = new HistogramDisplay(histogram);
        histograma.execute();
        
    }
    
    
}
