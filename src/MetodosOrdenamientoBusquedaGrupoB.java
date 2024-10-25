import models.Carro;
/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYear() > cars[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYear() < cars[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] cars, int year) {
        int left = 0;
        int right = cars.length - 1;
        while (left <= right) {
            int mitad = left + (right - left) / 2;
            if (cars[mitad].getYear() == year) {
                return mitad;
            }
            if (cars[mitad].getYear() < year) {
                left = mitad + 1;
            } else {
                right = mitad - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
        public void showCars(Carro[] cars) {
        for(Carro car : cars){
            System.out.println(car);
        }
    }
}