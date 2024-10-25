
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = new PersonasGenerator().generarPersonas();
        
        for(Person person : personas){
            System.out.println(person);
        }

        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        mOB.sortByAgeWithSelection(personas);
        mOB.showPeople(personas);
        int result = mOB.searchBinaryByAge(personas, 40);

        if(result == -1){
            System.out.println("No encontro");
        }else{
            System.out.println("Encontro en la posicion" + result);
        }



        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente

        Carro[] carros = generator.generarCarros();

        System.out.println("Listado de carros generadas:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }
        MetodosOrdenamientoBusquedaGrupoB mOBg2B = new MetodosOrdenamientoBusquedaGrupoB();
        mOBg2B.sortBYearWithBubbleAvnAsendente(carros);
        mOBg2B.showCars(carros);
        int result2 = mOBg2B.searchBinaryByYear(carros, 2020);

        if(result2 == -1){
            System.out.println("No encontro");
        }else{
            System.out.println("Encontro en la posicion: " + result2);
        }
    }
}
