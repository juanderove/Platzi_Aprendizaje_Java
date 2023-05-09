public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Recibe un bono por $200
        salary = salary + 200;
        System.out.println(salary);

        //Se descuenta $50 por pension
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extras y vale $30 cada una
        //Uso de cupon de comida por $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizar cadenas de texto
        String employeeName = "David";
        employeeName = employeeName + " Rodriguez Vera";
        System.out.println(employeeName);

        employeeName = "Juan " + employeeName;
        System.out.println("Tu Nombre es: " + employeeName);
    }
}
