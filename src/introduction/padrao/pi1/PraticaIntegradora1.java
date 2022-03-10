package introduction.padrao.pi1;

public class PraticaIntegradora1 {
    public static void main(String[] args) {
        String cidades[] = {"Londres","Madri","Nueva York","Buenos Aires","Assuncion",
                "São Paulo","Lima","Santiago de Chile","Lisboa","Tokyo"};
        Integer temperaturas[][] =  {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        String cidadeMinima = "";
        String cidadeMaxima = "";
        Integer temperaturaMinima = Integer.MAX_VALUE;
        Integer temperaturaMaxima = Integer.MIN_VALUE;for (int i=0; i < temperaturas.length; i++) {
            if (temperaturas[i][0] < temperaturaMinima){
                temperaturaMinima = temperaturas[i][0];
                cidadeMinima = cidades[i];
            }
            if (temperaturas[i][1] > temperaturaMaxima){
                temperaturaMaxima = temperaturas[i][1];
                cidadeMaxima = cidades[i];
            }
        }

        System.out.println(cidadeMinima + " possui a temperatura minima de " + temperaturaMinima);
        System.out.println(cidadeMaxima + " possui a temperatura maxima de " + temperaturaMaxima);
    }
}
