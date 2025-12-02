 package learnify;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Learnify {
//-------------IMAGENES------------\\
    //Unidad 1 
    //1.1
    static final ImageIcon fraccionRacional = crearImagen("/imagenes/unidad1/1.1/ejemplos/fraccionRacional.png", 30, 40);
    static final ImageIcon fraccionEjemplo = crearImagen("/imagenes/unidad1/1.1/ejemplos/fraccionEjemplo.png", 30, 40);
    static final ImageIcon fraccionEjemplo2 = crearImagen("/imagenes/unidad1/1.1/ejemplos/fraccionEjemplo2.png", 30, 40);
    static final ImageIcon fraccionEjemplo3 = crearImagen("/imagenes/unidad1/1.1/ejemplos/fraccionEjemplo3.png", 30, 40);    
        //Actividades
        //FRACCIONES
        static final ImageIcon fraccionEjercicio = crearImagen("/imagenes/unidad1/1.1/actividades/fracciones/fraccionEjercicio.png", 70, 100);
        static final ImageIcon fraccionEjercicio2 = crearImagen("/imagenes/unidad1/1.1/actividades/fracciones/fraccionEjercicio2.png", 70, 100);
        static final ImageIcon fraccionEjercicio3 = crearImagen("/imagenes/unidad1/1.1/actividades/fracciones/fraccionEjercicio3.png", 70, 100);
        static final ImageIcon fraccionEjercicio4 = crearImagen("/imagenes/unidad1/1.1/actividades/fracciones/fraccionEjercicio4.png", 70, 100);
        //RAICES
        static final ImageIcon ejercicioRaiz = crearImagen("/imagenes/unidad1/1.1/actividades/raices/raizCinco.png", 70, 60);
        static final ImageIcon ejercicioRaiz2= crearImagen("/imagenes/unidad1/1.1/actividades/raices/raizDieciocho.png", 70, 60);
        static final ImageIcon ejercicioRaiz3= crearImagen("/imagenes/unidad1/1.1/actividades/raices/tresRaizDos.png", 70, 60);
        static final ImageIcon ejercicioRaiz4= crearImagen("/imagenes/unidad1/1.1/actividades/raices/raizTres.png", 75, 65);
        static final ImageIcon ejercicioRaiz5= crearImagen("/imagenes/unidad1/1.1/actividades/raices/raizDoce.png", 75, 65); 
    //1.2
    static final ImageIcon intervalo = crearImagen("/imagenes/unidad1/1.2/ejemplos/intervaloEjemplo.png", 164, 89);
    static final ImageIcon intervalo2 = crearImagen("/imagenes/unidad1/1.2/ejemplos/intervaloEjemplo2.png", 187, 69);
    static final ImageIcon intervalo3 = crearImagen("/imagenes/unidad1/1.2/ejemplos/intervaloEjemplo3.png", 164, 89);
    static final ImageIcon intervalo4 = crearImagen("/imagenes/unidad1/1.2/ejemplos/intervaloEjemplo4.png", 164, 89);
    static final ImageIcon intervalo5 = crearImagen("/imagenes/unidad1/1.2/ejemplos/intervaloEjemplo5.png", 179, 75);
    static final ImageIcon intervalo6 = crearImagen("/imagenes/unidad1/1.2/ejemplos/intervaloEjemplo6.png", 200, 89);   
    //1.3
    static final ImageIcon funcion = crearImagen("/imagenes/unidad1/1.3/ejemplos/funcion.png", 110, 60);
    static final ImageIcon graficaEjemplo = crearImagen("/imagenes/unidad1/1.3/ejemplos/graficaEjemplo.png", 100, 100);
    static final ImageIcon graficaEjemplo2 = crearImagen("/imagenes/unidad1/1.3/ejemplos/graficaEjemplo2.png", 100, 100);
    //1.4
    static final ImageIcon funcionEjemplo = crearImagen("/imagenes/unidad1/1.4/ejemplos/funcionEjemplo.png", 200, 50);
    static final ImageIcon funcionEjemplo2 = crearImagen("/imagenes/unidad1/1.4/ejemplos/funcionEjemplo2.png", 200, 39);
    static final ImageIcon funcionEjemplo3 = crearImagen("/imagenes/unidad1/1.4/ejemplos/funcionEjemplo3.png", 200, 46);
    //1.5
        //Actividades
        static final ImageIcon ejercicioFuncion = crearImagen("/imagenes/unidad1/1.5/ejercicios/ejercicioFuncion.png", 285, 83);
        static final ImageIcon ejercicioFuncion2 = crearImagen("/imagenes/unidad1/1.5/ejercicios/ejercicioFuncion2.png", 221, 83);
        static final ImageIcon ejercicioFuncion3 = crearImagen("/imagenes/unidad1/1.5/ejercicios/ejercicioFuncion3.png", 221, 83);
        static final ImageIcon ejercicioFuncion4 = crearImagen("/imagenes/unidad1/1.5/ejercicios/ejercicioFuncion4.png", 221, 83);
        static final ImageIcon ejercicioFuncion5 = crearImagen("/imagenes/unidad1/1.5/ejercicios/ejercicioFuncion5.png", 221, 83);
    //1.6
    static final ImageIcon funcionEjemplo4 = crearImagen("/imagenes/unidad1/1.6/ejemplos/funcionEjemplo.png", 140, 57);
    static final ImageIcon funcionEjemplo5 = crearImagen("/imagenes/unidad1/1.6/ejemplos/funcionEjemplo2.png", 140, 60);
        //Actividades
        static final ImageIcon ejercicio2Funcion = crearImagen("/imagenes/unidad1/1.6/ejercicios/ejercicio2Funcion.png", 221, 83);        
    //1.7
        //Actividades
        static final ImageIcon ejercicioFuncionPartes = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes.png", 260, 83);
        static final ImageIcon ejercicioFuncionPartes2 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes2.png", 221, 83);
        static final ImageIcon ejercicioFuncionPartes3 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes3.png", 261, 83);
        static final ImageIcon ejercicioFuncionPartes4 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes4.png", 261, 83);
        static final ImageIcon ejercicioFuncionPartes5 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes5.png", 261, 83);
        static final ImageIcon ejercicioFuncionPartes6 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes6.png", 261, 83);
        static final ImageIcon ejercicioFuncionPartes7 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes7.png", 261, 83);
        static final ImageIcon ejercicioFuncionPartes8 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes8.png", 261, 83);
        static final ImageIcon ejercicioFuncionPartes9 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes9.png", 261, 83);
        static final ImageIcon ejercicioFuncionPartes10 = crearImagen("/imagenes/unidad1/1.7/ejercicios/ejercicioFuncionPartes10.png", 261, 83);    
    //1.9
        //Actividades
        static final ImageIcon ejercicioFuncionDivision = crearImagen("/imagenes/unidad1/1.9/ejercicios/ejercicioFuncionDivision.png", 331, 114);
    //1.13
    static final ImageIcon funcionNegativa = crearImagen("/imagenes/unidad1/1.13/ejemplos/funcionNegativa.png", 200, 64);    
    //2.1
    static final ImageIcon limiteEjemplo = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteEjemplo.png", 272, 89);
    static final ImageIcon limiteEjemplo2 = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteEjemplo2.png", 181, 79);
    static final ImageIcon limiteEjemplo3 = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteEjemplo3.png", 150, 80);
    static final ImageIcon indeterminacion = crearImagen("/imagenes/unidad2/1.1/ejemplos/indeterminacion.png", 46, 80);
    static final ImageIcon indeterminacion2 = crearImagen("/imagenes/unidad2/1.1/ejemplos/indeterminacion2.png", 70, 63);
    static final ImageIcon indeterminacion3 = crearImagen("/imagenes/unidad2/1.1/ejemplos/indeterminacion3.png", 111, 37);
    static final ImageIcon indeterminacion4 = crearImagen("/imagenes/unidad2/1.1/ejemplos/indeterminacion4.png", 105, 43);
    static final ImageIcon indeterminacion5 = crearImagen("/imagenes/unidad2/1.1/ejemplos/indeterminacion5.png", 54, 51);
    static final ImageIcon indeterminacion6 = crearImagen("/imagenes/unidad2/1.1/ejemplos/indeterminacion6.png", 55, 41);
    static final ImageIcon indeterminacion7 = crearImagen("/imagenes/unidad2/1.1/ejemplos/indeterminacion7.png", 48, 47);
    static final ImageIcon limiteConstante = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteConstante.png", 182, 72);
    static final ImageIcon limiteVariable = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteVariable.png", 186, 74);
    static final ImageIcon limiteCociente = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteCociente.png", 250, 100);
    static final ImageIcon limitePotencia = crearImagen("/imagenes/unidad2/1.1/ejemplos/limitePotencia.png", 250, 50);
    static final ImageIcon limiteSuma = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteSuma.png", 250, 50);
    static final ImageIcon limiteResta = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteResta.png", 250, 50);
    static final ImageIcon limiteProducto = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteProducto.png", 250, 50);
    static final ImageIcon limiteRaiz = crearImagen("/imagenes/unidad2/1.1/ejemplos/limiteRaiz.png", 250, 50);   
    //2.2
    static final ImageIcon limiteLateral = crearImagen("/imagenes/unidad2/1.2/ejemplos/limiteLateral.png", 250, 250);
    static final ImageIcon division = crearImagen("/imagenes/unidad2/1.2/ejemplos/division.png", 80, 57);
    //2.4
    static final ImageIcon asintotaVertical = crearImagen("/imagenes/unidad2/1.4/ejemplos/asintotaVertical.png", 250, 250);
    static final ImageIcon funcionPorTramos = crearImagen("/imagenes/unidad2/1.4/ejemplos/funcionPorTramos.png", 250, 250);
    static final ImageIcon huecoGrafica = crearImagen("/imagenes/unidad2/1.4/ejemplos/huecoGrafica.png", 250, 250);    
    //3.3
    static final ImageIcon funcionIncrementos = crearImagen("/imagenes/unidad3/1.3/ejemplos/funcionIncrementos.png", 160, 70);
    static final ImageIcon funcionIncrementos2 = crearImagen("/imagenes/unidad3/1.3/ejemplos/funcionIncrementos2.png", 300, 70);
    
    //EXTRAS\\
    static final ImageIcon iconoApp = crearImagen("/imagenes/extras/iconoApp.png", 64, 64);
    static final ImageIcon incorrectoImg = crearImagen("/imagenes/extras/incorrecto.png", 25, 25);
    static final ImageIcon correctoImg = crearImagen("/imagenes/extras/correcto.png", 25, 25);

    //INICIO CODIGO\\
    
    static CardLayout layout = new CardLayout();
    static JPanel panelPrincipal = new JPanel(layout);
    static ButtonGroup grupo = new ButtonGroup();
    
    static int leccionesCorrectas = 0;
    static int actividad = 0;
    //INCIO
    public static void main(String[] args) {
        crearFrame();
        crearMenu(); //<--- INICIO
        //crearSeccionTemas();
        
        //botonesAccion(2,1);
        //unidadesGeneral(1, 1);
        //botonesAccion("discretas", 1, 1, 2);
        //botonesAccion("calculo", 1, 3, 1);
        
    }
    //PRINCIPALES
    public static void crearFrame(){
        JFrame frame  = new JFrame("Learnify");
        frame.add(panelPrincipal);
        frame.setIconImage(iconoApp.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));

        frame.setSize(300, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
    }
    public static void crearMenu(){
        JPanel menuPanel = crearPanel(false, null);
        panelPrincipal.add(menuPanel);
        crearTexto(menuPanel, "Learnify", 32, Font.BOLD, "Calibri", 86, 10, 200, 50);
 
        JButton empezar = crearBotones("Aprender", false, null
                            , 90, 70, 100, 30, menuPanel);
        
        JButton cerrar = crearBotones("Salir", false, null
                            , 90, 120, 100, 30, menuPanel);

        empezar.addActionListener(e -> {botonesAccion(1, 1);});
        cerrar.addActionListener(e -> {botonesAccion(0, 0);});
    }
    public static void crearSeccionTemas(){
        frameTamaño(440, 200, "Learnify");
        
        JPanel temasPanel = crearPanel(true, "temas");

        JButton seccionCal = crearBotones("Calculo Diferencial", false, null
                            , 35, 70, 166, 30, temasPanel);
        
        JButton seccionDisc = crearBotones("Matematicas Discretas", false, null
                            , 225, 70, 166, 30, temasPanel);
        
        JButton salir = crearBotones("Salir", false, null
                            , 0, 142, 60, 20, temasPanel);
        
        crearTexto(temasPanel, "Temas disponibles", 24, Font.BOLD, "Arial", 100, 15, 220, 30);

        seccionCal.addActionListener(e -> {botonesAccion(2, 1);});
        seccionDisc.addActionListener(e -> {botonesAccion(2, 2);});
        
        salir.addActionListener(e -> {botonesAccion(0, 0);});
    }
    public static void dentroSecciones(int seccion){
        JPanel seccionPanel = crearPanel(true, "secciones");
        
        JButton unidad1 = crearBotones("Unidad 1", false, null
                                , 0, 0, 0, 0, seccionPanel);
        JButton unidad2 = crearBotones("Unidad 2", false, null
                            , 0, 0, 0, 0, seccionPanel);
        JButton unidad3 = crearBotones("Unidad 3", false, null
                            , 0, 0, 0, 0, seccionPanel);
        
        JButton volver = crearBotones("Volver", false, null
                            , 0, 0, 0, 0, seccionPanel);
        
        JLabel text = crearTexto(seccionPanel);
        
        switch(seccion){
            case 1 ->{
                frameTamaño(300, 300, "Learnify");
                
                actualizarTexto("Unidades", 24, Font.BOLD, "Arial", 80, 20, 200, 50, text);
                unidad1.setBounds(30, 80, 90, 20);
                unidad2.setBounds(160, 80, 90, 20);
                unidad3.setBounds(90, 150, 90, 20);
                volver.setBounds(0, 241, 70, 20);

                unidad1.addActionListener(e-> {botonesAccion("calculo", 0, 2, 1);});
                unidad2.addActionListener(e-> {botonesAccion("calculo", 0, 2, 2);});
                unidad3.addActionListener(e-> {botonesAccion("calculo", 0, 2, 3);});
            }
            case 2 ->{
                frameTamaño(250, 200, "Learnify");
                
                actualizarTexto("Unidades", 24, Font.BOLD, "Arial", 60, 20, 200, 50, text);
                unidad1.setBounds(70, 80, 90, 20);
                volver.setBounds(0, 141, 70, 20);

                unidad1.addActionListener(e-> {botonesAccion("discretas", 0, 2, 1);});
            }
        }
        volver.addActionListener(e -> {botonesAccion(1, 1);});
    }
    public static void unidadesGeneral(int unidad, int seccion){        
        JPanel uniCalPanel = crearPanel(true, "calculoUnidades");
        
        JLabel text = crearTexto(uniCalPanel);

        JButton volver = crearBotones("Volver", false, null
                                        , 0, 0, 0, 0, uniCalPanel);
        switch(seccion){
            case 1 -> {//SECCION CALCULO
                switch(unidad){
                    case 1 -> {
                        frameTamaño(400, 300, "Learnify (Estudiando)");
                        actualizarTexto("1. Funciones", 22, Font.BOLD, "Calibri", 140, 20, 200, 50, text);

                        JButton act1_1 = crearBotones("1.1", true, "Los números reales y sus subconjuntos"
                                , 40, 80, 60, 20, uniCalPanel);
                        JButton act1_2 = crearBotones("1.2", true, "Intervalos en los reales y su representación gráfica"
                                , 120, 80, 60, 20, uniCalPanel);
                        JButton act1_3 = crearBotones("1.3", true, "Definiciones básicas: variable (dependiente e independiente), relación, función, dominio y rango"
                                , 200, 80, 60, 20, uniCalPanel);
                        JButton act1_4 = crearBotones("1.4", true, "Función real de variable real y sus distintas representaciones (analítica, numérica, gráfica y verbal)"
                                , 280, 80, 60, 20, uniCalPanel);
                        JButton act1_5 = crearBotones("1.5", true, "Funciones algebraicas: polinomiales y racionales"
                                , 40, 120, 60, 20, uniCalPanel);
                        JButton act1_6 = crearBotones("1.6", true, "Funciones trascendentes: trigonométricas, logarítmicas y exponenciales"
                                , 120, 120, 60, 20, uniCalPanel);
                        JButton act1_7 = crearBotones("1.7", true, "Funciones definidas por partes"
                                , 200, 120, 60, 20, uniCalPanel);
                        JButton act1_8 = crearBotones("1.8", true, "Operaciones con funciones: Adición, Sustracción"
                                , 280, 120, 60, 20, uniCalPanel);
                        JButton act1_9 = crearBotones("1.9", true, "Operaciones con funciones: Multiplicación, División, Composición"
                                , 40, 160, 60, 20, uniCalPanel);
                        JButton act1_10 = crearBotones("1.10", true, "Transformaciones rigidas y no rígidas"
                                , 120, 160, 60, 20, uniCalPanel);
                        JButton act1_11 = crearBotones("1.11", true, "Funciones pares, impares y ni par ni impar"
                                , 200, 160, 60, 20, uniCalPanel);
                        JButton act1_12 = crearBotones("1.12", true, "Función inyectiva, suprayectiva y biyectiva"
                                , 280, 160, 60, 20, uniCalPanel);
                        JButton act1_13 = crearBotones("1.13", true, "La función inversa"
                                , 120, 200, 60, 20, uniCalPanel);
                        JButton act1_14 = crearBotones("1.14", true, "La función implícita"
                                , 200, 200, 60, 20, uniCalPanel);

                        volver.setBounds(0, 241, 70, 20);

                        act1_1.addActionListener(e -> {botonesAccion("calculo", 1, 1, 1);});
                        act1_2.addActionListener(e -> {botonesAccion("calculo", 1, 1, 2);});
                        act1_3.addActionListener(e -> {botonesAccion("calculo", 1, 1, 3);});
                        act1_4.addActionListener(e -> {botonesAccion("calculo", 1, 1, 4);});
                        act1_5.addActionListener(e -> {botonesAccion("calculo", 1, 1, 5);});
                        act1_6.addActionListener(e -> {botonesAccion("calculo", 1, 1, 6);});
                        act1_7.addActionListener(e -> {botonesAccion("calculo", 1, 1, 7);});
                        act1_8.addActionListener(e -> {botonesAccion("calculo", 1, 1, 8);});
                        act1_9.addActionListener(e -> {botonesAccion("calculo", 1, 1, 9);});
                        act1_10.addActionListener(e -> {botonesAccion("calculo", 1, 1, 10);});
                        act1_11.addActionListener(e -> {botonesAccion("calculo", 1, 1, 11);});
                        act1_12.addActionListener(e -> {botonesAccion("calculo", 1, 1, 12);});
                        act1_13.addActionListener(e -> {botonesAccion("calculo", 1, 1, 13);});
                        act1_14.addActionListener(e -> {botonesAccion("calculo", 1, 1, 14);});
                    }
                    case 2 -> {
                        frameTamaño(300, 300, "Learnify(Estudiando)");
                        actualizarTexto("2. Limites y continuidad", 22, Font.BOLD, "Calibri", 40, 20, 220, 50, text);
                        JButton act2_1 = crearBotones("2.1", true, "Introducción al concepto de límite de una función de variable real"
                                , 50, 80, 60, 20, uniCalPanel);
                        JButton act2_2 = crearBotones("2.2", true, "Cálculo de límites por métodos algebraicos"
                                , 160, 80, 60, 20, uniCalPanel);
                        JButton act2_3 = crearBotones("2.3", true, "Continuidad en un punto y en un intervalo"
                                , 50, 160, 60, 20, uniCalPanel);
                        JButton act2_4 = crearBotones("2.4", true, "Tipos de discontinuidades"
                                , 160, 160, 60, 20, uniCalPanel);

                        volver.setBounds(0, 241, 70, 20);

                        act2_1.addActionListener(e -> {botonesAccion("calculo", 2, 1, 1);});
                        act2_2.addActionListener(e -> {botonesAccion("calculo", 2, 1, 2);});
                        act2_3.addActionListener(e -> {botonesAccion("calculo", 2, 1, 3);});
                        act2_4.addActionListener(e -> {botonesAccion("calculo", 2, 1, 4);});
                    }
                    case 3 -> {
                        frameTamaño(310, 300, "Learnify(Estudiando)");
                        actualizarTexto("3. La derivada", 22, Font.BOLD, "Calibri", 80, 20, 250, 50, text);
                        JButton act3_1 = crearBotones("3.1", true, "Interpretación de la derivada"
                                , 30, 80, 60, 20, uniCalPanel);
                        JButton act3_2 = crearBotones("3.2", true, "Incrementos y razón de cambio"
                                , 120, 80, 60, 20, uniCalPanel);
                        JButton act3_3 = crearBotones("3.3", true, "Definición de derivada como límite de un cociente diferencial usando la regla de los cuatro pasos"
                                , 210, 80, 60, 20, uniCalPanel);
                        JButton act3_4 = crearBotones("3.4", true, "Cálculo de derivadas"
                                , 30, 160, 60, 20, uniCalPanel);
                        JButton act3_5 = crearBotones("3.5", true, "Derivada de funciones implicitas"
                                , 120, 160, 60, 20, uniCalPanel);
                        JButton act3_6 = crearBotones("3.6", true, "Derivadas de orden superior"
                                , 210, 160, 60, 20, uniCalPanel);

                        volver.setBounds(0, 241, 70, 20);

                        act3_1.addActionListener(e -> {botonesAccion("calculo", 3, 1, 1);});
                        act3_2.addActionListener(e -> {botonesAccion("calculo", 3, 1, 2);});
                        act3_3.addActionListener(e -> {botonesAccion("calculo", 3, 1, 3);});
                        act3_4.addActionListener(e -> {botonesAccion("calculo", 3, 1, 4);});
                        act3_5.addActionListener(e -> {botonesAccion("calculo", 3, 1, 5);});
                        act3_6.addActionListener(e -> {botonesAccion("calculo", 3, 1, 6);});
                    }
                }
            }
            case 2 -> {// DISCRETAS
                switch(unidad){
                    case 1 ->{ 
                        frameTamaño(300, 200, "Learnify(Estudiando)");
                        actualizarTexto("Sistemas numéricos ", 26, Font.BOLD, "Calibri", 40, 20, 220, 50, text);
                        JButton act1_1 = crearBotones("1.1", true, "Sistemas numéricos (Binario, Octal, Decimal, Hexadecimal)"
                                , 50, 80, 60, 20, uniCalPanel);
                        JButton act1_2 = crearBotones("1.2", true, "Conversiones entre sistemas numéricos"
                                , 160, 80, 60, 20, uniCalPanel);
                        
                        volver.setBounds(0, 141, 70, 20);

                        act1_1.addActionListener(e -> {botonesAccion("discretas", 1, 1, 1);});
                        act1_2.addActionListener(e -> {botonesAccion("discretas", 1, 1, 2);});
                    }
                }
            }
        }
        volver.addActionListener(e -> {botonesAccion(2, seccion);});
    }
    
    
    //TEXTOS       
    public static void crearInformacion(String curso, int unidad, int leccion){
        String titulos = "Calibri";
        
        frameTamaño(500, 400, "Learnify (Estudiando)");
        JPanel infoPanel = crearPanel(true, "informacion");
        
        JButton ejercicios = crearBotones("Ejercicios", false, null
                            , 400, 341, 90, 20, infoPanel);
        
        JButton regresar = crearBotones("Volver", false, null
                            , 0, 341,  70, 20, infoPanel);
        
        JLabel text = crearTexto(infoPanel);
        JTextPane text2 = new JTextPane();
        text2.setEditable(false);
        JScrollPane scroll  = new JScrollPane(text2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 70, 440, 220);
        infoPanel.add(scroll);
        
        switch(curso){
            case "calculo" -> {
                switch(unidad){
                    case 1 -> {
                        switch(leccion){
                            case 1 -> {
                                actualizarTexto("Los numeros reales y sus subconjuntos", 26, Font.BOLD, "Calibri", 
                                        30, 20, 500, 50, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 7, 14);});
                            }
                            case 2 -> {
                                actualizarTexto("Intervalos en los números reales", 26, Font.BOLD, titulos, 
                                        70, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 7, 14);});
                            }
                            case 3 -> {
                                actualizarTexto("Definiciones básicas de las funciones", 26, Font.BOLD, titulos, 
                                        50, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 5, 10);});
                            }
                            case 4 -> {
                                actualizarTexto("Función real de variable real", 26, Font.BOLD, titulos, 
                                        80, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 5, 10);});
                            }
                            case 5 -> {
                                actualizarTexto("Funciones algebraicas: polinomiales y racionales", 22, Font.BOLD, titulos, 
                                        20, -10, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 5, 10);});
                            }
                            case 6 -> {
                                actualizarTexto("Funciones trascendentes", 26, Font.BOLD, titulos, 
                                        120, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 5, 10);});
                            }
                            case 7 -> {
                                actualizarTexto("Funciones definidas por partes", 26, Font.BOLD, titulos, 
                                        70, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 5, 10);});
                            }
                            case 8 -> {
                                actualizarTexto("Operaciones básicas con funciones", 26, Font.BOLD, titulos, 
                                        50, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 5, 10);});
                            }
                            case 9 -> {
                                actualizarTexto("Operaciones complejas con funciones", 26, Font.BOLD, titulos, 
                                        30, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 5, 10);});
                            }
                            case 10 -> {
                                actualizarTexto("Transformaciones rigidas y no rígidas", 26, Font.BOLD, titulos, 
                                        30, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 11 -> {
                                actualizarTexto("Funciones pares, impares y ni par ni impar", 22, Font.BOLD, titulos, 
                                        40, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 12 -> {
                                actualizarTexto("Función inyectiva, suprayectiva y biyectiva", 22, Font.BOLD, titulos, 
                                        40, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 13 -> {
                                actualizarTexto("La función inversa", 26, Font.BOLD, titulos, 
                                        150, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 14 -> {
                                actualizarTexto("La función implícita", 26, Font.BOLD, titulos, 
                                        120, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                        }
                    }
                    case 2 -> {
                        switch(leccion){
                            case 1 -> {
                                actualizarTexto("Introducción al concepto de límite", 26, Font.BOLD, titulos, 
                                        50, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 2 -> {
                                actualizarTexto("Cálculo de límites", 26, Font.BOLD, titulos, 
                                        150, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 3 -> {
                                actualizarTexto("Continuidad en un punto y en un intervalo", 22, Font.BOLD, titulos, 
                                        50, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 4 -> {
                                actualizarTexto("Tipos de discontinuidades", 26, Font.BOLD, titulos, 
                                        100, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                        }
                    }
                    case 3 -> {
                        switch(leccion){
                            case 1 -> {
                                actualizarTexto("Interpretación de la derivada", 26, Font.BOLD, titulos, 
                                        80, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 2 -> {
                                actualizarTexto("Incrementos y razón de cambio", 26, Font.BOLD, titulos, 
                                        80, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 3 -> {
                                actualizarTexto("Definición de derivada como límite", 22, Font.BOLD, titulos, 
                                        80, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 4 -> {
                                actualizarTexto("Cálculo de derivadas", 26, Font.BOLD, titulos, 
                                        120, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 5 -> {
                                actualizarTexto("Derivada de funciones implicitas", 22, Font.BOLD, titulos, 
                                        80, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 6 -> {
                                actualizarTexto("Derivadas de orden superior", 26, Font.BOLD, titulos, 
                                        80, 0, 500, 100, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                        }
                    }

                }
            }
            case "discretas" -> {
                switch(unidad){
                    case 1 -> {
                        switch(leccion){
                            case 1 -> {
                                actualizarTexto("Sistemas numericos", 26, Font.BOLD, "Calibri", 
                                        130, 20, 500, 50, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {JOptionPane.showMessageDialog(null, "No cuenta con ejercicios este tema.", "Aviso", JOptionPane.INFORMATION_MESSAGE);});
                            }
                            case 2 -> {
                                actualizarTexto("Conversiones entre sistemas numéricos", 22, Font.BOLD, "Calibri", 
                                        60, 20, 500, 50, text);
                                agregarTexto(curso, text2, unidad, leccion);
                                ejercicios.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, 8, 16);});
                            }
                        }
                    }
                }
            }
            
        }
            
        regresar.addActionListener(e -> {botonesAccion(curso, 0, 2, unidad);}); 
    }
    public static void agregarTexto(String curso, JTextPane text, int unidad, int leccion){
        StyledDocument doc = text.getStyledDocument();
        
    //Estilos = TXT(STRING), TAMAÑO(INT), BOLD(BOOLEAN), ITALIC(BOOLEAN), COLOR(NEW)\\
        
        //Estilo normal(Arial)
        SimpleAttributeSet normal = crearEstiloTxt("Arial", 14, false, false, Color.BLACK);
        
        //Estilo normal(Consolas,ITALIC,BOLD)
        SimpleAttributeSet normalCIB = crearEstiloTxt("Consolas", 14, true, true, Color.BLACK);
        
        //Estilo normal (Consolas)
        SimpleAttributeSet normalC = crearEstiloTxt("Consolas", 14, false, false, Color.BLACK);
        
        //Estilo título
        SimpleAttributeSet titulo = crearEstiloTxt("Arial", 18, true, false, new Color(60, 90, 170));
        
        //Estilo subtitulo
        SimpleAttributeSet subtitulo = crearEstiloTxt("Arial", 15, false, true, new Color(60, 90, 170));

        //Estilo nota
        SimpleAttributeSet nota = crearEstiloTxt("Arial", 13, false, true, Color.GRAY);
        
        switch(curso){
            case "calculo" ->{
                switch(unidad){
                    case 1 -> {
                        switch(leccion){
                            case 1 -> {
                                agregarTexto(doc, "🔹 Los numeros reales", titulo);
                                agregarTexto(doc, """
                                                                          \n\nLos números reales representados con una ' ℝ ' son todos aquellos que pueden representarse en una recta numérica.
                                                                          \nEsto incluye tanto a los números positivos como negativos, además del cero, y abarcan a los racionales e irracionales.
                                                                          """, normal);
                                agregarTexto(doc, "\n\n🔹 Subconjuntos de los números reales", titulo);
                                agregarTexto(doc, "\n\nLos números reales se dividen en varios subconjuntos importantes:", normal);
                                agregarTexto(doc, "\n\nLos racionales:", subtitulo);
                                agregarTexto(doc, "\n\nSon los numeros que nos indican la relación que existe entre dos números enteros a y b, se representan con una ' ℚ '.", normal);
                                agregarTexto(doc, "\n\nSe observa de la forma:\n", nota);
                                text.insertIcon(fraccionRacional);
                                agregarTexto(doc, "\n\nLos irracionales:", subtitulo);
                                agregarTexto(doc, """
                                                                          \n\nAqui pertenecen aquellos numeros que no pueden expresarse como una fracción de dos números enteros.
                                                                          Tienen una parte decimal infinita y no periódica, lo que significa que no presentan un patrón repetitivo en sus cifras, estos se representan de la forma ' I '.
                                                                          """, normal);
                                agregarTexto(doc, "\n\nEjemplos de numeros irracionales son:", nota);
                                agregarTexto(doc, "\n• ", normalC);
                                agregarTexto(doc, "π", normalCIB);
                                agregarTexto(doc, " (pi) {≈3.141592653}\n• ", normalC);
                                agregarTexto(doc, "e", normalCIB);
                                agregarTexto(doc, " (euler) {≈2.7182818}", normalC);

                                agregarTexto(doc, "\n\nAdemas en el apartado de los numeros racionales estos se dividen en dos siendo:", normal);
                                agregarTexto(doc, "\n\nNumeros Enteros:", subtitulo);
                                agregarTexto(doc, """
                                                                          \n\nSe representan con el símbolo ' ℤ ' y son todos los números que no tienen parte decimal, pudiendo ser positivos, negativos o cero.
                                                                          \nAqui se encuentran:
                                                                          """, normal);
                                agregarTexto(doc, "\n\n⁜ Naturales", subtitulo);
                                agregarTexto(doc, """
                                                                          \nSon todos los numeros enteros que comienzen apartir del 1, estos son infinitos y comprenden tanto números pares como impares,
                                                                          estos se representan con el simbolo ' ℕ '."
                                                                          """, normal);
                                agregarTexto(doc, "\nAlgunos son:", nota);
                                agregarTexto(doc, "[1, 2, 3, ...]", normalC);
                                agregarTexto(doc, "\n\n⁜ Cero", subtitulo);
                                agregarTexto(doc, "\nEste es el único número que no es ni positivo ni negativo, y su presencia es fundamental para entender la relación entre los números.", normal);
                                agregarTexto(doc, "\nSu forma de representarse es:", normal);
                                agregarTexto(doc, "\nSu forma de representarse es:", nota);
                                agregarTexto(doc, "[ 0 ]", normalC);
                                agregarTexto(doc, "\n\n⁜ Enteros negativos", subtitulo);
                                agregarTexto(doc, """
                                                                          \nSon aquellos que tienen un valor menor que cero y se representan con un signo menos (-) delante ademas
                                                                          se encuentran a la izquierda del cero en la recta numérica y se utilizan para representar cantidades que están por debajo de cero.
                                                                          """, normal);
                                agregarTexto(doc, "\nEjemplos de estos son: ", nota);
                                agregarTexto(doc, "[-1, -2, -3, ...]", normalC);
                                agregarTexto(doc, "\n\nNumeros Fraccionarios:", subtitulo);
                                agregarTexto(doc, """
                                                                          \n\nEn este apartado se encuentra el resultado de dividir un número entero (numerador) entre otro número entero (denominador),
                                                                          donde el denominador nunca puede ser cero.
                                                                          """, normal);
                                agregarTexto(doc, "\nAlgunos ejemplos son:\n", nota);
                                text.insertIcon(fraccionEjemplo);
                                text.insertIcon(fraccionEjemplo2);
                                text.insertIcon(fraccionEjemplo3);
                                text.setCaretPosition(0);
                        }
                            case 2 -> {
                                agregarTexto(doc, "🔹 ¿Qué es un intervalo?", titulo);
                                agregarTexto(doc, """
                                                                          \n\nUn intervalo es un conjunto de números reales comprendidos entre dos valores llamados extremos.
                                                                          Estos extremos pueden estar incluidos o excluidos, dependiendo del tipo de intervalo.
                                                                          \nLos intervalos permiten describir conjuntos de números de forma compacta y ordenada.""", normal);
                                agregarTexto(doc, "\n\n🔹 Tipos de intervalos", titulo);
                                agregarTexto(doc, "\n\n1) Intervalo abierto", subtitulo);
                                agregarTexto(doc, """
                                                                          \nSe representa: (a, b)
                                                                          \nIncluye todos los números entre a y b, pero NO incluye los extremos.""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "(2, 5) => 2 < x < 5\n", normalC);
                                agregarTexto(doc, "\n\nEjemplo grafico:\n\n", nota);
                                text.insertIcon(intervalo);
                                agregarTexto(doc, "\n\n2) Intervalo cerrado", subtitulo);
                                agregarTexto(doc, """
                                                                          \nSe representa: [a, b]
                                                                          \nIncluye todos los números entre a y b, sí incluye los extremos.""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "[−1, 4] => −1 ≤ x ≤ 4", normalC);
                                agregarTexto(doc, "\n\nEjemplo grafico:\n\n", nota);
                                text.insertIcon(intervalo2);
                                agregarTexto(doc, "\n\n3) Intervalo semiabierto o semicerrado", subtitulo);
                                agregarTexto(doc, """
                                                                          \nHay dos variantes:
                                                                          \n• (a, b]
                                                                          \nIncluye b pero NO a""", normal);
                                agregarTexto(doc, "\n\nSe representa:", nota);
                                agregarTexto(doc, "a < x ≤ b", normalC);
                                agregarTexto(doc, "\n\nEjemplo grafico:\n\n", nota);
                                text.insertIcon(intervalo3);
                                agregarTexto(doc, """
                                                                          \nY la otra:
                                                                          \n• [a, b)
                                                                          \nEsta incluye a pero NO b""", normal);
                                agregarTexto(doc, "\n\nSe representa:", nota);
                                agregarTexto(doc, "a ≤ x < b", normalC);
                                agregarTexto(doc, "\n\nEjemplo grafico:\n\n", nota);
                                text.insertIcon(intervalo4);
                                agregarTexto(doc, "\n\n4) Intervalos infinitos", subtitulo);
                                agregarTexto(doc, """
                                                                          \nCuando no hay límite en un lado se usa ∞ o −∞,
                                                                          que nunca se encierran entre corchetes porque no son números.""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "(3, ∞) => x > 3", normalC);
                                agregarTexto(doc, "\n\nEjemplo grafico:\n\n ", nota);
                                text.insertIcon(intervalo5);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "(−∞, 0] => x ≤ 0", normal);
                                agregarTexto(doc, "\n\nEjemplo grafico:\n\n ", nota);
                                text.insertIcon(intervalo6);
                                agregarTexto(doc, "\n\n🔹 Cómo reconocer un intervalo a partir de una desigualdad", titulo);

                                agregarTexto(doc, """
                                                                          \nLa forma de convertir una desigualdad a un intervalo es observando la desigualdad ejemplos de estos son:""", normal);
                                agregarTexto(doc, """
                                                                          \nDesigualdad             Intervalo
                                                                            x > 2                  (2, ∞)
                                                                            x ≤ −4                (−∞, −4]
                                                                           1 < x ≤ 7               (1, 7]
                                                                          -3 ≤ x < 0              [−3, 0)
                                                                          """, normalCIB);
                                agregarTexto(doc, "\n\n🔹 Ejemplos rápidos", titulo);
                                agregarTexto(doc, """
                                                                          \n\n1. Intervalo de números mayores que 3  =>  (3, ∞)
                                                                          \n2. Intervalo entre −2 y 5 incluyendo ambos  =>  [−2, 5]
                                                                          \n3. Números menores o iguales a −1  =>  (−∞, −1]
                                                                          \n4. Números entre 0 y 4 sin incluirlos  =>  (0, 4) """, normal);
                                text.setCaretPosition(0);
                        }
                            case 3 -> {
                                agregarTexto(doc, "🔹 ¿Qué es una variable?", titulo);
                                agregarTexto(doc, "\n\nUna variable es un símbolo que representa un valor que puede cambiar.", normal);
                                agregarTexto(doc, "\nTipos de variables:", subtitulo);
                                agregarTexto(doc, "\n\n1) Variable independiente", normalCIB);
                                agregarTexto(doc, """
                                                                          \nEs la que tú eliges o controlas.
                                                                          \n• No depende de ninguna otra variable
                                                                          \n• Se suele representar con x.""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "En la función f(x) = 2x + 3, la variable independiente es x.", normal);

                                agregarTexto(doc, "\n\n2) Variable dependiente", normalCIB);
                                agregarTexto(doc, """
                                                                          \nEs la que cambia según el valor de la variable independiente.
                                                                          \n• Depende de lo que pase con x.
                                                                          \n• Se suele representar con y o f(x).""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "Si f(x) = 2x + 3, la variable dependiente es y = f(x).", normal);
                                agregarTexto(doc, "\n\n🔹 ¿Qué es una relación?", titulo);
                                agregarTexto(doc, "\n\nUna relación entre dos conjuntos es la correspondencia entre sus elementos.", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, """
                                                                          \nA = {1, 2, 3}
                                                                          \nB = {4, 5}
                                                                          \nRelación posible:
                                                                          \n(1, 4), (2, 4), (2, 5), (3, 5)""", normal);
                                agregarTexto(doc, "\n\nAquí estamos relacionando elementos del conjunto A con elementos del conjunto B.", normal);
                                agregarTexto(doc, "\n\n🔹 ¿Qué es una función?", titulo);
                                agregarTexto(doc, """
                                                                          \n\nUna función es una relación especial donde cada elemento del dominio se asocia con un único elemento del rango.
                                                                          \nEs decir:
                                                                          \nUna función NO puede asignar dos valores distintos a la misma x.""", normal);
                                agregarTexto(doc, "\n\nEjemplos válidos: ", nota);
                                agregarTexto(doc, "\n(1, 5), (2, 5), (3, 8)", normal);
                                agregarTexto(doc, "\n\nEjemplo NO válido: ", nota);
                                agregarTexto(doc, "\n(2, 5) y (2, 9) → la misma x tiene dos y  → eso NO es función", normal);
                                agregarTexto(doc, "\n\n🔹 Dominio", titulo);
                                agregarTexto(doc, "\n\nEl dominio de una función es el conjunto de valores permitidos para x (variable independiente).", normal);
                                agregarTexto(doc, "\n\nEjemplo:\n", nota);
                                text.insertIcon(funcion);
                                agregarTexto(doc, """
                                                                          \nEl dominio es todos los reales excepto x = 2
                                                                          \nSe escribe de la forma: (−∞, 2) ∪ (2, ∞)""", normal);
                                agregarTexto(doc, "\n\n🔹 Rango y/o Imagen", titulo);
                                agregarTexto(doc, "\n\nEl rango es el conjunto de valores que puede tomar y o f(x).", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, """
                                                                          \nf(x) = x²
                                                                          \nEl rango es:
                                                                          \n[0, ∞) (porque no puede dar valores negativos)""", normal);
                                agregarTexto(doc, "\n\n🔹 Cómo identificar si una relación es una función", titulo);
                                agregarTexto(doc, """
                                                                          \n\n1. Si repite una misma x con valores distintos → NO es función
                                                                          \n 2. Si cada x tiene solo una y → Sí es función
                                                                          \n 3. En una gráfica:
                                                                          \n• Si una vertical corta la gráfica en 2 puntos → NO es función""", normal);
                                agregarTexto(doc, "\n\nEjemplo de grafica:", nota);
                                agregarTexto(doc, "\nAqui SI es función:\n\n", normalCIB);
                                text.insertIcon(graficaEjemplo);
                                agregarTexto(doc, "\nAqui NO es función:\n\n", normalCIB);
                                text.insertIcon(graficaEjemplo2);

                                text.setCaretPosition(0);
                        }
                            case 4 -> {
                                agregarTexto(doc, "🔹 ¿Qué es una función real de variable real?", titulo);
                                agregarTexto(doc, "\n\nUna función real de variable real es una regla que asigna a cada número real x un número real y.", normal);
                                agregarTexto(doc, "\nSe expresa como:", nota);
                                agregarTexto(doc, "\nf: ℝ → ℝ", normalC);
                                agregarTexto(doc, "\nO simplemente:", nota);
                                agregarTexto(doc, "\ny = f(x)", normalC);
                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\nf(x) = 3x − 2", normal);
                                agregarTexto(doc, "\nPor lo tanto", normalCIB);
                                agregarTexto(doc, "\nSi x = 2 → f(2) = 3(2) - 2 → f(2) = 4", normal);
                                agregarTexto(doc, "\n\n🔹 Representaciones de una función", titulo);
                                agregarTexto(doc, """
                                                                          \n\nUna función se puede expresar de varias formas.
                                                                          \nLas cuatro representaciones esenciales son:""", normal);
                                agregarTexto(doc, "\n\n1. Representación analítica (por fórmula)", normalCIB);
                                agregarTexto(doc, "\nEs cuando la función se expresa mediante una expresión algebraica, ecuación o regla matemática.", normal);
                                agregarTexto(doc, "\nEjemplos:", nota);
                                agregarTexto(doc, "\na)\n", normal);
                                text.insertIcon(funcionEjemplo);
                                agregarTexto(doc, "\nb)\n", normal);
                                text.insertIcon(funcionEjemplo2);
                                agregarTexto(doc, "\nc)\n", normal);
                                text.insertIcon(funcionEjemplo3);
                                agregarTexto(doc, "\n\n2. Representación numérica (tablas de valores)", normalCIB);
                                agregarTexto(doc, "\nSe muestra la función mediante una tabla que indica valores de x y su correspondiente f(x).", normal);
                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\nTabulación de x²:", normalCIB);
                                agregarTexto(doc, """
                                                  \nx            |           f(x)
                                                  -2           |           4
                                                  -1           |           1
                                                  0            |           0
                                                  1            |           1
                                                  2            |           4
                                                  """, normal);
                                agregarTexto(doc, "\n\n3. Representación gráfica", normalCIB);
                                agregarTexto(doc, "\nSe dibuja la función en un sistema de coordenadas (plano cartesiano).", normal);
                                agregarTexto(doc, "\nEjemplos:", nota);
                                agregarTexto(doc, "\nLínea recta → funciones lineales", normal);
                                agregarTexto(doc, "\nCurvas en U → funciones cuadráticas", normal);
                                agregarTexto(doc, "\nCurva creciente o decreciente → raíz cuadrada, exponenciales, logarítmicas", normal);
                                agregarTexto(doc, "\n\n4. Representación verbal (en palabras)", normalCIB);
                                agregarTexto(doc, "\nExplica con palabras qué hace la función.", normal);
                                agregarTexto(doc, "\n\nEjemplo de: ", nota);
                                agregarTexto(doc, "f(x) = 3x - 2", normalC);
                                agregarTexto(doc, "\n'La función toma un número, lo multiplica por 3 y luego le resta 2.'", normal);
                                agregarTexto(doc, "\n\nEjemplo de: ", nota);
                                agregarTexto(doc, "f(x) = x²", normalC);
                                agregarTexto(doc, "\n'La función devuelve el cuadrado del valor que se ingresa.'", normal);
                                text.setCaretPosition(0);
                        }
                            case 5 -> {
                                agregarTexto(doc, "🔹 Función algebraica", titulo);
                                agregarTexto(doc, """
                                                                          \n\nSon funciones que se construyen usando solo operaciones algebraicas: sumar, restar, multiplicar, dividir, potencias y raíces.
                                                                          Mientras la expresión tenga solo esas operaciones, es una función algebraica.
                                                                          \nEsto incluye a una gran variedad de expresiones que no requieren funciones especiales como logaritmos o trigonometría.
                                                                          Ademas su comportamiento suele ser predecible porque están formadas únicamente por transformaciones algebraicas directas.""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "\nf(x) = x + 4", normalC);
                                agregarTexto(doc, "\n\nAquí la función suma y luego aplica una raíz.", normal);
                                agregarTexto(doc, "\n• Debido a eso es algebraica.", normalCIB);
                                agregarTexto(doc, "\n\n🔹 Función polinomial", titulo);
                                agregarTexto(doc, """
                                                                          \n\nEs un tipo de función algebraica en la cual la variable aparece únicamente elevada a potencias enteras no negativas.
                                                                          Son funciones muy usadas en matemáticas porque su comportamiento es suave y continuo en todo su dominio.
                                                                          No contienen raíces, fracciones con la variable en el denominador ni exponentes negativos o fraccionarios.
                                                                          Ademas es una suma de términos con potencias tranquilas de la variable.""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "\nf(x) = 3x² − 2x + 1", normalC);
                                agregarTexto(doc, "\n\nEsta función solo tiene potencias enteras positivas y una constante", normal);
                                agregarTexto(doc, "\n• Debido a eso es una función polinomial.", normalCIB);

                                agregarTexto(doc, "\n\n🔹 Función racional", titulo);
                                agregarTexto(doc, """
                                                                          \n\nEs una función formada al dividir un polinomio entre otro polinomio, lo cual genera una expresión fraccionaria.
                                                                          Estas funciones pueden presentar restricciones debido a que el denominador no puede tomar el valor cero.
                                                                          Su comportamiento puede incluir asíntotas y discontinuidades, lo que las hace importantes para analizar cambios bruscos."
                                                                          Ademas Siempre tiene forma de fracción con polinomios arriba y abajo.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:\n", nota);
                                text.insertIcon(ejercicioFuncion2);
                                agregarTexto(doc, "\n\nEl numerador es un polinomio y el denominador también.", normal);
                                agregarTexto(doc, "\n• Por lo tanto es una función racional", normalCIB);
                                text.setCaretPosition(0);
                        }
                            case 6 -> {
                                agregarTexto(doc, """
                                                    Son funciones que no pueden escribirse solamente mediante operaciones algebraicas como potencias, raíces o sumas.
                                                    Describen fenómenos más complejos como crecimiento continuo, oscilaciones y comportamiento no algebraico.
                                                    Incluyen funciones como las exponenciales, logarítmicas y trigonométricas.
                                                    Se les llama trascendentes porque no pueden ser expresadas como combinaciones finitas de operaciones algebraicas.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:\n", nota);
                                text.insertIcon(funcionEjemplo5);
                                agregarTexto(doc, "\n\nLa variable aparece en el exponente, lo que no es posible con operaciones algebraicas simples.", normal);
                                agregarTexto(doc, "\n• Por eso es una función trascendente.", normalCIB);
                                agregarTexto(doc, "\n\n🔹 Funciones trigonométricas", titulo);
                                agregarTexto(doc, """
                                                    \n\nSon funciones trascendentes basadas en las razones de un triángulo rectángulo o en el movimiento circular.
                                                    Modelan fenómenos periódicos como ondas, vibraciones, ciclos naturales y comportamientos repetitivos.
                                                    Las más comunes son seno, coseno y tangente, cada una describiendo relaciones geométricas específicas.
                                                    Se caracterizan por repetir sus valores en intervalos constantes, siendo funciones periódicas.""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "\nf(x) = sen(x)", normalC);
                                agregarTexto(doc, "\n\nEsta función describe una oscilación continua que se repite cada cierto intervalo.", normal);
                                agregarTexto(doc, "\n• Por eso es una función trigonométrica.", normalCIB);
                                agregarTexto(doc, "\n\n🔹 Funciones logarítmicas", titulo);
                                agregarTexto(doc, """
                                                    \n\nSon funciones trascendentes que representan la inversa de las funciones exponenciales.
                                                    Determinan el exponente necesario para alcanzar un valor dado a partir de una base específica.
                                                    Su crecimiento es lento, por lo que se usan en fenómenos donde la variación disminuye progresivamente.
                                                    Se emplean en escalas como decibeles, pH, intensidad y crecimiento relativo.""", normal);
                                agregarTexto(doc, "\n\nEjemplo: ", nota);
                                agregarTexto(doc, "\nf(x) = log(x)", normalC);
                                agregarTexto(doc, "\n\nIndica el exponente al que debe elevarse la base para obtener el valor dado.", normal);
                                agregarTexto(doc, "\n• Por eso es una función logarítmica.", normalCIB);
                                agregarTexto(doc, "\n\n🔹 Funciones exponenciales", titulo);
                                agregarTexto(doc, """
                                                    \n\nSon funciones trascendentes donde la variable aparece como exponente, generando un crecimiento o decrecimiento acelerado.
                                                    Se aplican en fenómenos de cambio rápido como intereses compuestos, radioactividad, epidemias y crecimiento poblacional.
                                                    Su variación es proporcional al valor actual de la función, lo que produce un crecimiento continuo.
                                                    Tienen un comportamiento muy característico debido a que cada incremento implica un factor multiplicativo, no aditivo.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:\n", nota);
                                text.insertIcon(funcionEjemplo4);
                                agregarTexto(doc, "\n\nMuestra un crecimiento que se duplica constantemente a medida que aumenta la variable.", normal);
                                agregarTexto(doc, "\n• Por eso es una función exponencial.", normalCIB);
                                text.setCaretPosition(0);
                        }
                            case 7 -> {
                                agregarTexto(doc, """
                                                    Son funciones que utilizan distintas expresiones matemáticas según el valor que tome la variable.
                                                    Esto significa que no existe una única fórmula válida para todos los valores, sino que cada intervalo del dominio tiene su propia regla.
                                                    Se usan cuando un fenómeno cambia de comportamiento en diferentes tramos y una sola ecuación no basta para describirlo.
                                                    También aparecen en situaciones reales como tarifas escalonadas, movimientos con cambios bruscos o cálculos por intervalos.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:\n\n", nota);
                                text.insertIcon(ejercicioFuncionPartes);
                                agregarTexto(doc, """
                                                    \n\nAquí la función emplea una fórmula distinta dependiendo de si x es negativo o no.
                                                    Por lo que cada expresión solo se usa dentro del intervalo que le corresponde.""", normal);
                                text.setCaretPosition(0);
                        }
                            case 8 -> {
                                agregarTexto(doc, "🔹 Operaciones con funciones", titulo);
                                agregarTexto(doc, """
                                                                          \n\nSon procedimientos que permiten combinar dos o más funciones para formar una nueva, evaluando cómo se relacionan sus valores al evaluarse en el mismo punto del dominio.
                                                                          Estas operaciones permiten estudiar fenómenos simultáneos, comparaciones y transformaciones entre funciones, ampliando las herramientas para modelar situaciones reales.
                                                                          Las funciones resultantes pueden conservar o modificar el comportamiento de las funciones originales según la manera en que se combinen.
                                                                          Cada operación requiere considerar el dominio común de las funciones implicadas.""", normal);
                                agregarTexto(doc, "\n\n🔹 Suma de funciones", titulo);
                                agregarTexto(doc, """
                                                                          \n\nLa suma consiste en agregar los valores producidos por dos funciones en cada punto del dominio, creando una función que representa el efecto conjunto de ambas.
                                                                          Esta operación es útil para estudiar acumulaciones, contribuciones simultáneas o situaciones donde varios procesos actúan al mismo tiempo.
                                                                          La suma solo puede aplicarse en los puntos donde ambas funciones están definidas.
                                                                          Considere siempre el dominio común antes de operar.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, "\n(f + g)(x) = f(x) + g(x)", normalC);
                                agregarTexto(doc, "\nSi f(x) = x + 2 y g(x) = 3x, entonces:", normal);
                                agregarTexto(doc, "\n(f + g)(x) = (x + 2) + 3x = 4x + 2", normalC);
                                agregarTexto(doc, "\n\n• Este ejemplo muestra cómo combinar términos semejantes tras la suma.", normalCIB);

                                agregarTexto(doc, "\n\n🔹 Resta de funciones", titulo);
                                agregarTexto(doc, """
                                                                          \n\nLa resta calcula la diferencia entre los valores de dos funciones, mostrando cuánto se separa una función de la otra en cada punto del dominio.
                                                                          Se emplea para analizar contrastes, márgenes o tendencias opuestas entre dos procesos que se comparan.
                                                                          Al igual que la suma, la resta solo existe donde ambas funciones están definidas.
                                                                          Revisar signos y agrupaciones al simplificar la expresión resultante.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                                          (f - g)(x) = f(x) - g(x)
                                                                          \nSi f(x) = x² y g(x) = x, entonces:
                                                                          \n(f - g)(x) = x² - x
                                                                          """, normalC);
                                agregarTexto(doc, "\n\n• Al simplificar, verifica términos semejantes y signos.", normalCIB);
                                text.setCaretPosition(0);
                        }
                            case 9 -> {
                                agregarTexto(doc, "🔹 Multiplicación de funciones", titulo);
                                agregarTexto(doc, """
                                                                          \n\nLa multiplicación de funciones crea una nueva función cuyo valor se obtiene multiplicando los valores de dos funciones en el mismo punto del dominio.
                                                                          Esta operación permite combinar efectos simultáneos, donde una función puede amplificar o modificar el comportamiento de la otra.
                                                                          Para que la multiplicación exista, ambas funciones deben estar definidas en el mismo punto.
                                                                          Es importante analizar cómo la multiplicación afecta el crecimiento y la curvatura de la función resultante.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                                          \n(f · g)(x) = f(x) g(x)
                                                                          \nSi f(x) = x y g(x) = x + 1, entonces:
                                                                          \n(f · g)(x) = x(x + 1) = x² + x
                                                                          """, normalC);
                                agregarTexto(doc, "\n\n• El producto puede generar cambios importantes en la forma y velocidad de crecimiento.", normalCIB);

                                agregarTexto(doc, "\n\n🔹 División de funciones", titulo);
                                agregarTexto(doc, """
                                                                          \n\nLa división de funciones forma una nueva función al dividir los valores de una función entre los de otra en el mismo punto del dominio.
                                                                          Se utiliza para analizar razones, tasas y comparaciones, mostrando cómo una cantidad cambia en relación con otra.
                                                                          El denominador nunca debe valer cero, por lo que esta operación introduce restricciones claras en el dominio.
                                                                          La división puede producir discontinuidades y saltos verticales según el comportamiento del denominador.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                                          \n(f / g)(x) = f(x) / g(x)
                                                                          \nSi f(x) = x² y g(x) = x, entonces:
                                                                          \n(f / g)(x) = x² / x = x,
                                                                          \ncon la condición de que x ≠ 0
                                                                          """, normalC);
                                agregarTexto(doc, "\n\n• Es fundamental identificar valores prohibidos antes de efectuar la división.", normalCIB);
                                agregarTexto(doc, "\n\n🔹 Composición de funciones", titulo);
                                agregarTexto(doc, """
                                                                          \n\nLa composición de funciones consiste en aplicar una función dentro de otra, usando como entrada el resultado producido por la función interna.
                                                                          Este proceso modela transformaciones encadenadas, donde la salida de un paso se convierte en la entrada del siguiente.
                                                                          El dominio de la composición depende de que los valores generados por la función interna sean válidos para la función externa.
                                                                          La composición puede cambiar completamente el comportamiento respecto de cada función individual.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                                          \n(f * g)(x) = f(g(x))
                                                                          \nSi f(x) = 2x y g(x) = x + 3, entonces:
                                                                          \n(f * g)(x) = 2(x + 3) = 2x + 6
                                                                          """, normalC);
                                agregarTexto(doc, "\n\n• Siempre verifica la compatibilidad entre rango de la interna y dominio de la externa.", normalCIB);
                                text.setCaretPosition(0);
                        }
                            case 10 -> {
                                agregarTexto(doc, """
                                                    Las transformaciones de funciones describen cómo cambia la gráfica cuando se aplican modificaciones que permiten desplazarla, reflejarla o deformarla sin alterar su naturaleza algebraica.
                                                    Estas transformaciones ayudan a comprender cómo se comporta una función cuando se modifica su expresión, permitiendo anticipar cambios en su posición, orientación o forma.
                                                    Las transformaciones se dividen en rígidas, que conservan la forma, y no rígidas, que la modifican.
                                                    Es importante identificar el tipo de transformación para predecir el efecto visual en la gráfica.""", normal);
                                agregarTexto(doc, "\n\n🔹 Transformaciones rígidas", titulo);
                                agregarTexto(doc, """
                                                    \n\nLas transformaciones rígidas son aquellas que no alteran la forma de la gráfica, manteniendo la misma curvatura, inclinación y proporciones entre puntos.
                                                    Incluyen traslaciones y reflexiones, cambios que solo afectan la ubicación u orientación de la función dentro del plano cartesiano.
                                                    Estas estrategias permiten desplazar la función sin alterar su estructura o dimensiones.
                                                    Conservan la forma exacta de la función original en todo momento.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                    \nSea f(x) = x²
                                                    \nLa transformación f(x) + 3 mueve la gráfica 3 unidades hacia arriba sin cambiar su forma.""", normalC);
                                agregarTexto(doc, "\n\n• Aqui la función conserva su curvatura parabólica, modificando únicamente su posición vertical.", normalCIB);
                                agregarTexto(doc, "\n\nEste tipo de desplazamiento ilustra cómo la forma permanece intacta al aplicar una traslación.", normal);

                                agregarTexto(doc, "\n\n🔹 Transformaciones no rígidas", titulo);
                                agregarTexto(doc, """
                                                    \n\n Las transformaciones no rígidas cambian la forma de la gráfica, modificando su estiramiento, compresión o escala en sentido vertical u horizontal.
                                                    Alteran la amplitud, inclinación y proporciones, produciendo efectos visibles que deforman la apariencia original de la función.
                                                    Incluyen estiramientos y compresiones que modifican la distancia entre puntos y la pendiente de la gráfica.
                                                    Este tipo de transformación afecta directamente la estructura y forma de la función.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                    \nSea f(x) = x²
                                                    \nLa transformación 3f(x) = 3x² estira verticalmente la gráfica, haciéndola más angosta.""", normalC);
                                agregarTexto(doc, "\n\n• Aqui la compresión o estiramiento altera la escala y transforma la curvatura de la función.", normalCIB);
                                agregarTexto(doc, "\n\nEste tipo de cambio demuestra cómo la forma se modifica al aplicar un factor multiplicativo.", normal);
                                text.setCaretPosition(0);
                        }
                            case 11 -> {
                                agregarTexto(doc, """
                                                    na función puede analizarse mediante la simetría que presenta respecto al eje y o al origen, observando cómo se comporta al comparar sus valores en x y en −x.
                                                    \nComprender este tipo de clasificación permite reconocer patrones estructurales, simplificar cálculos y anticipar la forma de la gráfica sin necesidad de representarla por completo.
                                                    \nMuchas funciones presentan simetría exacta, lo que facilita su estudio en integrales, análisis gráfico o resolución de problemas donde la estructura de la función juega un papel fundamental.
                                                    \nSin embargo, existen funciones que no cumplen ninguna de las dos condiciones clásicas, y aun así constituyen casos importantes en el análisis matemático debido a su comportamiento mixto o asimétrico.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                    \nUna función par cumple f(−x) = f(x)
                                                    como en el caso de f(x) = x², cuya gráfica es simétrica respecto al eje y.
                                                    \nUna función impar cumple f(−x) = −f(x),
                                                    como f(x) = x³, cuya gráfica muestra simetría rotacional de 180° alrededor del origen.""", normalC);
                                agregarTexto(doc, "\n\n• Una función como f(x) = x² + x no es par ni impar porque no satisface ninguna de las condiciones, lo que resulta en una gráfica sin simetrías especiales.", normalCIB);
                                agregarTexto(doc, "\n\nReconocer estos tres tipos permite clasificar funciones de manera más completa y comprender mejor su estructura y comportamiento en el plano cartesiano.", normal);
                                text.setCaretPosition(0);
                        }
                            case 12 -> {
                                agregarTexto(doc, "🔹 Función inyectiva", titulo);
                                agregarTexto(doc, """
                                                                          \n\nUna función es inyectiva cuando cada elemento distinto del dominio produce una imagen diferente en el codominio, de modo que ningún valor se repite como resultado.
                                                                          \nEsta propiedad garantiza que la función distingue completamente a los elementos del dominio, evitando que dos entradas diferentes coincidan en un mismo valor de salida.
                                                                          \nLas funciones inyectivas permiten establecer relaciones donde cada resultado identifica de manera única a su preimagen, lo cual es útil para estudiar modelos sin pérdida de información.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                                          \nf(x) = 3x − 1
                                                                          Es inyectiva porque, al ser estrictamente creciente, nunca asigna la misma salida a dos valores diferentes de x.""", normalC);
                                agregarTexto(doc, "\n\nLa inyectividad es fundamental para determinar si una función puede poseer inversa definida en todo su dominio.", normal);

                                agregarTexto(doc, "\n\n🔹 Función suprayectiva", titulo);
                                agregarTexto(doc, """
                                                                          \n\nUna función es suprayectiva cuando cada elemento del codominio es alcanzado por al menos un valor del dominio, asegurando que la función cubre completamente el conjunto de llegada.
                                                                          \nEste tipo de función garantiza que no quedan valores “vacíos” en el codominio, lo que implica que la relación matemática describe plenamente el conjunto objetivo.
                                                                          \nLas funciones suprayectivas resultan importantes en contextos donde es necesario asegurar que todos los valores posibles sean producidos por el proceso representado.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                                          \nf(x) = x³
                                                                          Es suprayectiva sobre ℝ porque puede generar cualquier número real como resultado, alcanzando todo el codominio sin excepciones.""", normalC);
                                agregarTexto(doc, "\n\nLa suprayectividad es clave cuando se requiere que la función abarque por completo el conjunto destino.", normal);

                                agregarTexto(doc, "\n\n🔹 Función biyectiva", titulo);
                                agregarTexto(doc, """
                                                                          \n\nUna función es biyectiva cuando es simultáneamente inyectiva y suprayectiva, estableciendo una correspondencia uno a uno entre cada elemento del dominio y cada elemento del codominio.
                                                                          \nEn este tipo de función no existen valores repetidos ni valores sin asignar, lo que genera una relación perfecta y completamente reversible entre los conjuntos.
                                                                          \nLas funciones biyectivas permiten construir una función inversa que deshace exactamente el efecto de la original, lo cual resulta esencial en transformaciones y equivalencias matemáticas.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                                          \nf(x) = x + 4
                                                                          Es biyectiva porque asigna a cada número real un único resultado y, al mismo tiempo, cubre todos los números reales sin omitir ninguno.""", normalC);
                                agregarTexto(doc, "\n\nLa biyectividad asegura una correspondencia completa que permite definir inversas sin ambigüedad.", normal);
                                text.setCaretPosition(0);
                        }
                            case 13 -> {
                                agregarTexto(doc, """
                                                    Una función inversa es aquella que “deshace” el efecto de la función original, devolviendo cada valor a su punto de partida.
                                                    Para que exista, la función debe asignar valores de manera que cada resultado provenga de un único valor de entrada.
                                                    \nEn términos más sencillos, si una función transforma x en y, la función inversa transforma ese mismo y nuevamente en x.
                                                    Esto significa que ambas funciones se reversan mutuamente y que su composición recupera la identidad.
                                                    Para que esto sea posible, la función debe ser inyectiva y permitir invertir su regla de correspondencia sin ambigüedades.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                    \nSi f(x) = 2x + 3
                                                    La función inversa busca recuperar x a partir de un valor dado.
                                                    Al despejar se obtiene:\n\n""", normalC);
                                text.insertIcon(funcionNegativa);
                                agregarTexto(doc, "\n\nDe este modo, aplicar primero f y después f⁻¹ devuelve el valor inicial sin modificarlo.", normalC);
                                agregarTexto(doc, "\n\nLa existencia de una función inversa garantiza que la relación sea completamente reversible y otorga una forma simétrica de interpretar el comportamiento de la función original.", normal);
                                text.setCaretPosition(0);
                        }
                            case 14 -> {
                                agregarTexto(doc, """
                                                    Una función implícita es una relación entre variables donde la variable dependiente no aparece aislada.
                                                    En lugar de expresarla como y = f(x), ambas variables aparecen combinadas dentro de una misma ecuación.
                                                    Esto hace que la dependencia de una respecto de la otra no sea inmediata, pero aun así la relación puede describir curvas, superficies o comportamientos bien definidos.
                                                    \nEste tipo de funciones es útil cuando la relación entre las variables es compleja o cuando resulta difícil o incluso imposible el despejar a la variable dependiente.
                                                    Aun así, la ecuación implícita define un conjunto de puntos que satisfacen la relación y, en muchos casos, ese conjunto puede interpretarse como una o varias funciones.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                    \nPor ejemplo, la ecuación:
                                                    x² + y² = 25
                                                    Representa una función implícita: y está mezclada con x dentro de la ecuación.
                                                    Aunque y no está aislada, la relación describe un círculo de radio 5.
                                                    Si se quisiera hacer explícita, habría que despejar y, lo que produce dos ramas:""", normalC);
                                agregarTexto(doc, "\n\nLas funciones implícitas permiten modelar relaciones más complejas y generalizar el concepto de función, especialmente útiles en cálculo multivariable y geometría.", normal);
                                text.setCaretPosition(0);
                        }
                        }
                    }
                    case 2 -> {
                        switch(leccion){
                            case 1 -> {
                                agregarTexto(doc, """
                                                Los límites permiten analizar qué valor se aproxima una función cuando la variable x se acerca a un número dado,
                                                aunque no necesariamente lo alcance.
                                                """, normal);
                                agregarTexto(doc, "\n\nEjemplo básico:\n\n", nota);
                                text.insertIcon(limiteEjemplo);
                                agregarTexto(doc, """
                                                    \nPorque cuando x se acerca a 3, la función se acerca a 7.
                                                    \nEsto debido a que:""", normal);
                                agregarTexto(doc, """
                                                    \n✔ El límite describe el comportamiento de la función.
                                                    ✔ No siempre importa el valor exacto de la función en ese punto.""", normalCIB);
                                agregarTexto(doc, "\n\n🔹 Definición intuitiva de límite", titulo);
                                agregarTexto(doc, "\n\nLa idea intuitiva del límite es:", normal);
                                agregarTexto(doc, "\n“El límite es el valor al que se acerca la función cuando x se acerca a un número.”", normalCIB);
                                agregarTexto(doc,"""
                                                                         \n\nEsto significa que:
                                                                         x se puede acercar por la izquierda (valores menores) o por la derecha (valores mayores)
                                                                         Si ambos coinciden, el límite existe.""", normal);
                                agregarTexto(doc, "\n\nEjemplo:\n\n", nota);
                                text.insertIcon(limiteEjemplo2);
                                agregarTexto(doc, "\n\nPorque cuando x se acerca a 2, la función se acerca a 4.", normal);
                                agregarTexto(doc, "\n\n🔹 Concepto de indeterminación y sus distintas formas", titulo);
                                agregarTexto(doc, "\n\nLas indeterminaciones aparecen cuando se intenta evaluar un límite y el resultado directo no tiene sentido matemático.", normal);
                                agregarTexto(doc, "\n\nEjemplo clásico:\n\n", nota);
                                text.insertIcon(indeterminacion);
                                agregarTexto(doc, "\n\nEsto significa que hay que trabajar la expresión (factorizar, racionalizar, etc.) para obtener una forma válida.", normal);
                                agregarTexto(doc, "\nFormas de indeterminación más comunes:", normalCIB);
                                agregarTexto(doc, "\n1. Indeterminaciones básicas:", subtitulo);
                                agregarTexto(doc, "\na)\n\n", normal);
                                text.insertIcon(indeterminacion2);
                                agregarTexto(doc, "\nb)\n\n", normal);
                                text.insertIcon(indeterminacion3);
                                agregarTexto(doc, "\nc)\n\n", normal);
                                text.insertIcon(indeterminacion4);
                                agregarTexto(doc, "\n2. Indeterminaciones en potencias y exponentes:", subtitulo);
                                agregarTexto(doc, "\na)\n\n", normal);
                                text.insertIcon(indeterminacion5);
                                agregarTexto(doc, "\nb)\n\n", normal);
                                text.insertIcon(indeterminacion6);
                                agregarTexto(doc, "\nc)\n\n", normal);
                                text.insertIcon(indeterminacion7);
                                agregarTexto(doc, "\n\nCada una requiere técnicas especiales para resolverse, como:", normal);
                                agregarTexto(doc, """
                                                                          \n•Factorización
                                                                          •Racionalización
                                                                          •Multiplicar por conjugado
                                                                          •Operaciones en potencias (logaritmos para 1^∞, por ejemplo)""", normalCIB);
                                agregarTexto(doc, "\n\n🔹 Cálculo de límites por método tabular", titulo);
                                agregarTexto(doc, "\n\nConsiste en acercar valores de x al punto desde ambos lados y observar el comportamiento de la función.", normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, "\nCalcular:\n\n", normalCIB);
                                text.insertIcon(limiteEjemplo3);
                                agregarTexto(doc, "\nTabulación:\n\n", normalCIB);
                                agregarTexto(doc, """
                                                  x         |        f(x)
                                                  0.9      |       1.9
                                                  0.99    |       1.99
                                                  0.999  |       1.999
                                                  1.1      |        2.1
                                                  1.01    |        2.01
                                                  1.001  |        2.001""", normal);
                                agregarTexto(doc, """
                                                \n→ La función se acerca a 2\n
                                                → El límite es 2""", normal);
                                agregarTexto(doc, "\n\n🔹 Propiedades de los límites", titulo);
                                agregarTexto(doc, "\n\nEstas propiedades permiten resolver límites más rápido sin usar tablas ni gráficas.", normal);
                                agregarTexto(doc, "\n1. Límite de una constante\n\n", subtitulo);
                                text.insertIcon(limiteConstante);
                                agregarTexto(doc, "\n2. Límite de la variable\n", subtitulo);
                                text.insertIcon(limiteVariable);
                                agregarTexto(doc, "\n3. Suma\n", subtitulo);
                                text.insertIcon(limiteSuma);
                                agregarTexto(doc, "\n4. Resta\n", subtitulo);
                                text.insertIcon(limiteResta);
                                agregarTexto(doc, "\n5. Producto\n", subtitulo);
                                text.insertIcon(limiteProducto);
                                agregarTexto(doc, "\n6. Cociente\n", subtitulo);
                                text.insertIcon(limiteCociente);
                                agregarTexto(doc, "\n7. Límite de una potencia\n", subtitulo);
                                text.insertIcon(limitePotencia);
                                agregarTexto(doc, "\n8. Raíces\n", subtitulo);
                                text.insertIcon(limiteRaiz);
                                text.setCaretPosition(0);
                        }
                            case 2 -> {
                                agregarTexto(doc, "🔹 Cálculo de límites por métodos algebraicos", titulo);
                                agregarTexto(doc, """
                                \n\nLos límites por métodos algebraicos consisten en manipular la expresión usando técnicas como:
                                • Sustitución directa
                                • Factorización
                                • Simplificación
                                • Racionalización
                                • Identidades trigonométricas o exponenciales""", normal);
                                agregarTexto(doc, """
                                \n\nEl objetivo es transformar expresiones que generan indeterminaciones (como 0/0)
                                en formas que sí puedan evaluarse correctamente.""", normalCIB);
                                agregarTexto(doc, "\n\n🔹 Límites laterales", titulo);
                                agregarTexto(doc, """
                                \n\nLos límites laterales estudian el comportamiento de una función al acercarse a un punto
                                por un solo lado.
                                • Límite por la izquierda:  lim(x→a⁻) f(x)
                                • Límite por la derecha:    lim(x→a⁺) f(x)""", normal);
                                agregarTexto(doc, """
                                \nEl límite existe si y solo si ambos límites laterales coinciden:
                                lim(x→a) f(x) = L  ⇔  lim(x→a⁻)=L  y  lim(x→a⁺)=L""", normalCIB);
                                agregarTexto(doc, "\n\nEjemplo típico:\n\n", nota);
                                text.insertIcon(limiteLateral);
                                agregarTexto(doc, """
                                \n\nLos límites laterales son esenciales en funciones por tramos, en gráficos con saltos y en la presencia de asíntotas verticales.""", normal);
                                agregarTexto(doc, "\n\n🔹 Límites de funciones racionales", titulo);
                                agregarTexto(doc, """
                                \n\nUna función racional es un cociente de polinomios:
                                f(x) = P(x) / Q(x)
                                Hay tres casos importantes:""", normal);
                                agregarTexto(doc, "\n1) Sustitución directa", subtitulo);
                                agregarTexto(doc, """
                                \nSi Q(a) ≠ 0, basta con evaluar:
                                lim(x→a) P(x)/Q(x) = P(a)/Q(a)""", normal);
                                agregarTexto(doc, "\n2) Forma indeterminada 0/0", subtitulo);
                                agregarTexto(doc, """
                                \nPara resolverla se usa:
                                • Factorización
                                • Cancelación de términos
                                • Racionalización
                                • Identities algebraicas""", normal);
                                agregarTexto(doc, "\nEjemplo:\n\n", nota);
                                text.insertIcon(division);
                                agregarTexto(doc, """
                                \n\nal factorizar queda (x+3).
                                El límite es 6.""", normalCIB);
                                agregarTexto(doc, "\n3) Denominador tiende a 0 y numerador no", subtitulo);
                                agregarTexto(doc, """
                                \nProduce límites infinitos → asíntotas verticales.""", normal);
                                agregarTexto(doc, "\n\n🔹 Límites de funciones trascendentes", titulo);
                                agregarTexto(doc, """
                                \n\nSon límites donde intervienen funciones que no son polinomios:
                                • Trigonométricas
                                • Exponenciales
                                • Logarítmicas
                                Se resuelven usando propiedades y límites fundamentales.""", normal);
                                agregarTexto(doc, "\n\n🔸 Límites de funciones trigonométricas", subtitulo);
                                agregarTexto(doc, """
                                \n\nEl límite fundamental es:
                                lim(x→0) sin(x)/x = 1""", normalCIB);
                                agregarTexto(doc, """
                                \nDe este se derivan otros importantes:
                                • lim(x→0) (1 - cos(x))/x = 0
                                • lim(x→0) tan(x)/x = 1
                                Para resolver límites trigonométricos se usan:
                                • Sustitución directa
                                • Identidades trigonométricas
                                • Transformación para obtener sin(x)/x""", normal);
                                agregarTexto(doc, "\n\n🔸 Límites de funciones exponenciales y logarítmicas", subtitulo);
                                agregarTexto(doc, """
                                \n\nEstas funciones son continuas, por lo tanto:
                                lim(x→a) e^x = e^a
                                lim(x→a) ln(x) = ln(a)""", normal);
                                agregarTexto(doc, """
                                Límites fundamentales:
                                • lim(x→0) (e^x − 1)/x = 1
                                • lim(x→0) (a^x − 1)/x = ln(a)
                                • lim(x→0⁺) ln(x) = −∞""", normalCIB);
                                agregarTexto(doc, """
                                \nSe aplican técnicas como:
                                • Propiedades de logaritmos
                                • Reescritura exponencial
                                • Sustitución adecuada""", normal);
                                agregarTexto(doc, "\n\n🔹 Límites infinitos y al infinito", titulo);
                                agregarTexto(doc, """
                                \n\nA) Límites infinitos: f(x) se hace arbitrariamente grande cuando x se acerca a un valor:
                                lim(x→a) f(x) = ±∞
                                Indican la presencia de asíntotas verticales.""", normal);
                                agregarTexto(doc, """
                                \nEjemplo:
                                lim(x→0) 1/x² = +∞""", normalCIB);
                                agregarTexto(doc, """
                                \nB) Límites al infinito: describen el comportamiento cuando x → +∞ o x → −∞.""", normal);
                                agregarTexto(doc, "\n• Polinomios:", subtitulo);
                                agregarTexto(doc, """
                                \nEl término dominante (el de mayor grado) determina el comportamiento.
                                Ejemplo:
                                lim(x→∞) (3x⁴ − 2x + 1) = +∞""", normalCIB);
                                agregarTexto(doc, "\n• Funciones racionales:", subtitulo);
                                agregarTexto(doc, """
                                \nCaso 1: grado arriba < grado abajo → límite = 0  
                                Caso 2: grados iguales → coeficientes líderes  
                                Caso 3: grado arriba > grado abajo → ±∞""", normal);
                                agregarTexto(doc, "\n• Exponenciales y logarítmicas:", subtitulo);
                                agregarTexto(doc, """
                                \n• e^x → ∞ cuando x → ∞
                                • e^x → 0 cuando x → −∞
                                • ln(x) → ∞ cuando x → ∞
                                • ln(x) → −∞ cuando x → 0⁺""", normalCIB);
                                text.setCaretPosition(0);
                            }
                            case 3 -> {
                                agregarTexto(doc, """
                                Una función es continua cuando su gráfica no presenta “saltos”, “huecos” o quiebres.
                                Formalmente, la continuidad en un punto significa que no hay interrupciones en
                                el comportamiento de la función cerca de ese punto.""", normal);
                                agregarTexto(doc, "\n\n🔸 Continuidad en un punto", subtitulo);
                                agregarTexto(doc, """
                                \n\nUna función f(x) es continua en x = a si se cumplen las tres condiciones:
                                1. El límite por la izquierda existe
                                2. El límite por la derecha existe
                                3. Ambos límites son iguales al valor de la función
                                Es decir:""", normal);
                                agregarTexto(doc, """
                                  \nlim(x→a⁻) f(x) = lim(x→a⁺) f(x) = f(a)""", normalCIB);
                                agregarTexto(doc, """
                                \n\nSi al sustituir x=a no aparece indeterminación y el límite coincide con f(a),
                                la función es continua en ese punto.""", normal);
                                agregarTexto(doc, "\n\n🔸 Continuidad en un intervalo", subtitulo);
                                agregarTexto(doc, """
                                \n\nUna función es continua en un intervalo si es continua en todos los puntos
                                que pertenecen a ese intervalo.
                                Tipos de intervalos donde puede ser continua:
                                • Intervalos abiertos:  (a, b)
                                • Intervalos cerrados:  [a, b]
                                • Semiabiertos:         (a, b], [a, b)""", normal);
                                agregarTexto(doc, """
                                \nPara intervalos cerrados:
                                • Debe ser continua en todos los puntos internos
                                • En los extremos se revisa continuidad lateral:
                                   – En x=a: límite por la derecha = f(a)
                                   – En x=b: límite por la izquierda = f(b)""", normalCIB);
                                agregarTexto(doc, "\n\nImportante:", subtitulo);
                                agregarTexto(doc, """
                                \nLas funciones polinomiales, exponenciales, logarítmicas y trigonométricas son continuas en todo su dominio.""", normal);
                                text.setCaretPosition(0);
                            }
                            case 4 -> {
                                agregarTexto(doc, """
                                Una discontinuidad ocurre cuando la función presenta un salto, hueco,
                                ruptura o un valor que no coincide con su límite.
                                Existen varios tipos clasificados según la forma en que la gráfica “se rompe”.""", normal);
                                agregarTexto(doc, "\n\n🔸 1. Discontinuidad evitable o removible", subtitulo);
                                agregarTexto(doc, """
                                \n\nOcurre cuando el límite existe, pero f(a) no está definido
                                o no coincide con el límite.
                                Se puede “arreglar” definiendo adecuadamente f(a).""", normal);
                                agregarTexto(doc, "\nEjemplo:\n\n", nota);
                                text.insertIcon(huecoGrafica);
                                agregarTexto(doc, """
                                \n\nlim(x→a) f(x) = L   pero   f(a) ≠ L  o f(a) no existe.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 2. Discontinuidad de salto", subtitulo);
                                agregarTexto(doc, """
                                \n\nSucede cuando los límites laterales existen pero son diferentes:
                                lim(x→a⁻) f(x) ≠ lim(x→a⁺) f(x)""", normalCIB);
                                agregarTexto(doc, """
                                \nLa gráfica se “rompe” y da un salto vertical.""", normal);
                                agregarTexto(doc, "\nEjemplo típico:\n\n", nota);
                                text.insertIcon(funcionPorTramos);
                                agregarTexto(doc, "\n\n🔸 3. Discontinuidad infinita", subtitulo);
                                agregarTexto(doc, """
                                \n\nOcurre cuando la función crece sin límite hacia +∞ o −∞
                                al acercarse a un punto.
                                Indica una asíntota vertical.""", normal);
                                agregarTexto(doc, """
                                \nEjemplo:
                                lim(x→a⁺) f(x) = +∞
                                lim(x→a⁻) f(x) = −∞\n\n""", normalCIB);
                                text.insertIcon(asintotaVertical);
                                agregarTexto(doc, "\n\n🔸 4. Discontinuidad oscilatoria", subtitulo);
                                agregarTexto(doc, """
                                \n\nAparece cuando la función oscila infinitamente cerca del punto
                                sin acercarse a un valor limitado.
                                Un ejemplo clásico es:
                                f(x) = sin(1/x)""", normal);
                                agregarTexto(doc, """
                                \nEl límite no existe porque la función vibra entre -1 y 1 infinitas veces.""", normalCIB);
                                text.setCaretPosition(0);
                            }
                        }
                    }
                    case 3 -> {
                        switch(leccion){
                            case 1 -> {
                                agregarTexto(doc, """
                                                  Los límites permiten analizar qué valor se aproxima una función cuando la variable x se acerca a un número dado,
                                                  aunque no necesariamente lo alcance.
                                                  Permite comprender cómo evoluciona un fenómeno cuando se observa en escalas muy pequeñas, evitando mirar intervalos grandes 
                                                  y centrándose en el comportamiento puntual.
                                                  La derivada también puede interpretarse como la pendiente de la recta tangente a la gráfica de la función, 
                                                  lo que indica si la función está creciendo, decreciendo o manteniéndose constante en ese lugar.
                                                  En contextos físicos suele representar velocidad instantánea; en contextos económicos, costo marginal; y en otros campos, 
                                                  cualquier ritmo de cambio puntual aplicable al fenómeno estudiado.                        
                                                    """, normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                  \nSi f(x)=x²
                                                  La derivada es f′(x)=2x
                                                  Por lo que en x=3 vale 6
                                                  Esto significa que la gráfica tiene pendiente 6 en ese punto y que la función aumenta con un ritmo inmediato de 6 unidades por cada unidad que avanza x.
                                                  """, normalC);
                                agregarTexto(doc, "\nEsta interpretación es esencial para analizar y predecir comportamientos locales de funciones en problemas reales.", normal);
                                text.setCaretPosition(0);
                            }
                            case 2 -> {
                                agregarTexto(doc, "🔹 Incrementos", titulo);
                                agregarTexto(doc, """
                                                  \n\nLos incrementos representan el cambio total que experimenta una función cuando su variable independiente varía una pequeña cantidad, 
                                                  permitiendo medir cómo se desplaza el valor de la función entre dos puntos cercanos.
                                                  Este concepto analiza la diferencia directa entre el valor final y el inicial, mostrando cuánto sube o baja la función en ese pequeño recorrido.      
                                                  El incremento ayuda a comprender la variación global dentro de un intervalo corto y es útil para estudiar aproximaciones y cambios locales antes de recurrir a la derivada.
                                                  También sirve como fundamento para estimar comportamientos de funciones cuando se utilizan aproximaciones lineales o análisis de error.
                                                    """, normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                  \nSi una función pasa de f(a) a f(a+h)
                                                  El incremento es Δf = f(a+h) − f(a)
                                                  Lo cual mide cuánto cambió la función debido al cambio h en la variable.
                                                  """, normalC);
                                agregarTexto(doc, "\nEste concepto permite observar variaciones totales y preparar la transición hacia la noción de cambio instantáneo.", normal);
                                agregarTexto(doc, "\n\n🔹 Razón de cambio", titulo);
                                agregarTexto(doc, """
                                                  \n\nLa razón de cambio indica qué tan rápido varía una función respecto a su variable independiente dentro de un intervalo pequeño, 
                                                  comparando directamente la variación de salida contra la variación de entrada.
                                                  Describe la velocidad promedio con la que crece o decrece la función, permitiendo entender el ritmo de cambio sobre un tramo específico.
                                                  La razón de cambio media es clave para interpretar tendencias locales, y es la base conceptual de la razón de cambio instantánea definida por la derivada.
                                                  Cuando el intervalo se hace muy pequeño, la razón de cambio muestra cómo se comporta la función casi punto por punto, conduciendo al concepto central del cálculo diferencial.
                                                    """, normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                  \nSi Δf es el cambio en la función entre a y a+h
                                                  La razón de cambio media se expresa como Δf / h
                                                  Que se convierte en f′(a) cuando h tiende a 0.
                                                  """, normalC);
                                agregarTexto(doc, "\nEsta noción permite conectar el cambio promedio con la velocidad instantánea que posteriormente formaliza la derivada.", normal);
                                text.setCaretPosition(0);
                            }
                            case 3 -> {
                                agregarTexto(doc, """
                                                  La derivada es el valor que resulta al tomar el límite del cociente diferencial, y representa la razón de cambio instantánea de la función en un punto.
                                                  Esta definición formaliza la idea de velocidad o pendiente en un punto, emergiendo al considerar cambios cada vez más pequeños en la variable independiente.
                                                  La regla de los cuatro pasos estructura el cálculo desde la definición para evitar errores algebraicos y clarificar cómo aparece el límite cuando h → 0.
                                                  \nPaso 1 — Calcular f(a+h): se sustituye a+h en la expresión de la función para obtener el valor de la función desplazada por h.
                                                  f(a+h) = ...
                                                  \nPaso 2 — Formar la diferencia f(a+h) − f(a): se resta el valor original f(a) para obtener el incremento Δf provocado por el cambio h.
                                                  Δf = f(a+h) − f(a)
                                                  \nPaso 3 — Construir el cociente diferencial (f(a+h) − f(a)) / h: se divide el incremento por h para obtener la razón de cambio media sobre el intervalo de longitud h.
                                                    \n""", normal);
                                text.insertIcon(funcionIncrementos);
                                agregarTexto(doc, "\nPaso 4 — Tomar el límite cuando h → 0: se analiza el comportamiento del cociente cuando h tiende a cero; si el límite existe y es finito, ese es f′(a).\n", normal);
                                text.insertIcon(funcionIncrementos2);
                                agregarTexto(doc, "\nDetalles algebraicos importantes", subtitulo);
                                agregarTexto(doc, """
                                                  \n— En el paso 2 suele aparecer un factor h en todas las sumas; factorizar h antes de dividir evita indeterminaciones 0/0.
                                                  \n— En el paso 3 se simplifica el cociente cancelando el factor h (siempre que aparezca) para dejar una expresión en la que el límite h → 0 sea evaluable.
                                                  \n— Si después de simplificar queda dependencia de h, se evalúa el límite; si el límite no existe, la derivada en ese punto no existe.
                                                    """, normal);
                                agregarTexto(doc, "\nEsta presentación por pasos aclara la lógica detrás de la derivada y muestra cómo el límite elimina la dependencia del incremento para revelar la tasa de cambio instantánea.", normal);
                                text.setCaretPosition(0);
                            }
                            case 4 -> {
                                agregarTexto(doc, """
                                                  El cálculo de derivadas consiste en aplicar reglas y procedimientos que permiten obtener la razón de cambio instantánea de una función sin recurrir cada vez a la definición con límites.
                                                  \nEstas reglas se basan en resultados ya demostrados mediante la definición formal de derivada, lo que permite trabajar de forma rápida, precisa y estructurada con funciones comunes.
                                                  \nDerivar implica identificar la forma de la función, aplicar la regla correspondiente y simplificar el resultado para obtener una expresión que describa la variación puntual de la función.
                                                  \nEl proceso comienza reconociendo si la función es potencia, producto, cociente, composición o una combinación de ellas, pues cada estructura requiere una regla específica.
                                                  \nEntre las reglas más utilizadas se encuentran: la regla de la potencia, la regla del producto, la regla del cociente y la regla de la cadena, además de tablas de derivadas de funciones básicas.
                                                  \nEl cálculo de derivadas permite analizar crecimiento, decrecimiento, puntos críticos, concavidades y comportamientos locales de funciones en contextos matemáticos y aplicados.
                                                  \nPara funciones más complejas, se combinan varias reglas de derivación de forma jerárquica, respetando la estructura interna de la función y evitando modificar el orden algebraico.
                                                    """, normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                  \nSi f(x)=3x⁴−5x²+7
                                                  Se deriva aplicando la regla de la potencia a cada término: f′(x)=12x³−10x.
                                                  """, normalC);
                                agregarTexto(doc, "\nEste método ofrece un camino rápido y limpio para obtener la derivada sin necesidad de usar límites manualmente en cada ejercicio.", normal);
                                text.setCaretPosition(0);
                            }
                            case 5 -> {
                                agregarTexto(doc, """
                                                  Una función implícita es aquella donde la variable dependiente y la independiente aparecen mezcladas en una misma ecuación, sin estar despejada explícitamente como y = f(x).
                                                  \nAl derivar funciones implícitas, la idea central es aplicar derivación a ambos lados de la ecuación, considerando que y depende de x. Esto obliga a usar la regla de la cadena cuando derivamos cualquier término que incluya y.
                                                  \nEl procedimiento permite trabajar con ecuaciones donde despejar la variable sería difícil o imposible, evitando manipulaciones algebraicas extensas y obteniendo directamente la derivada y′.
                                                  \nPara derivar implícitamente, cada término que tenga y se deriva como si fuera una composición: primero según su forma (potencia, producto, etc.) y luego multiplicando por y′ porque y es función de x.
                                                  \nEste método se vuelve indispensable en curvas cerradas como circunferencias, elipses, hipérbolas o ecuaciones complejas donde la variable dependiente no está aislada.
                                                  \nLa derivación implícita mantiene la estructura original de la ecuación, permitiendo calcular pendientes, tangentes y tasas de cambio incluso sin tener una forma explícita de la función.
                                                  \nLos errores comunes provienen de olvidar aplicar la regla de la cadena a los términos con y o no derivar correctamente productos y combinaciones mixtas entre x y y.
                                                    """, normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                  \nPara x² + y² = 25
                                                  Derivamos ambos lados: 2x + 2y·y′ = 0
                                                  Luego despejamos: y′ = −x / y
                                                  """, normalC);
                                agregarTexto(doc, "\nEste método facilita obtener y′ directamente sin tener que aislar y, lo que en muchos casos sería complicado o requeriría raíces con signos ambiguos.", normal);
                                text.setCaretPosition(0);  
                            }
                            case 6 -> {
                                agregarTexto(doc, """
                                                  Las derivadas de orden superior surgen cuando se aplica el proceso de derivación varias veces a una función, analizando así no solo su cambio instantáneo, sino también cómo evoluciona ese cambio.
                                                  \nLa primera derivada mide la razón de cambio inmediata de la función; al derivarla nuevamente obtenemos la segunda derivada, que describe cómo varía la pendiente, es decir, cómo cambia la razón de cambio inicial.
                                                  \nLa segunda derivada resulta especialmente útil para estudiar la concavidad de una gráfica y para identificar puntos donde la función cambia de curvatura, conocidos como puntos de inflexión.
                                                  \nSi se continúa el proceso, la tercera derivada mide el cambio de la segunda derivada, y así sucesivamente. Cada nueva derivada agrega un nivel más profundo de información sobre el comportamiento local de la función.
                                                  \nEn notación, la n-ésima derivada se escribe como f⁽ⁿ⁾(x), lo cual representa haber aplicado el operador de derivación un total de n veces, manteniendo siempre el respeto a las reglas de derivación y la estructura original de la función.
                                                  \nLas derivadas de orden superior se utilizan en modelos matemáticos avanzados, como mecánica, vibraciones, análisis de movimiento, series de Taylor, ecuaciones diferenciales y estudios que requieren comprender la evolución dinámica de un fenómeno.
                                                  \nLos errores comunes al trabajar con derivadas sucesivas suelen relacionarse con signos incorrectos, derivar términos que ya no dependen de la variable o cambiar sin cuidado la estructura algebraica en cada paso.
                                                    """, normal);
                                agregarTexto(doc, "\n\nEjemplo:", nota);
                                agregarTexto(doc, """
                                                  \nSi f(x) = x³ − 4x
                                                  Entonces f′(x) = 3x² − 4 y la segunda derivada es f″(x) = 6x 
                                                  Esto muestra cómo la curvatura de la función depende directamente de x.
                                                  """, normalC);
                                agregarTexto(doc, "\nLas derivadas sucesivas permiten un análisis más completo del comportamiento de una función, revelando tendencias que la primera derivada por sí sola no puede mostrar.", normal);
                                text.setCaretPosition(0);
                            }
                        }
                    }

                }
            }
            case "discretas" ->{
                switch(unidad){
                    case 1 ->{
                        switch(leccion){
                            case 1 -> {
                                agregarTexto(doc, """
                                Un sistema numérico es una forma de representar cantidades usando símbolos
                                y reglas específicas. En matemáticas discretas y computación, los más usados son:
                                • Decimal
                                • Binario
                                • Octal
                                • Hexadecimal""", normal);
                                agregarTexto(doc, """
                                \nCada sistema se distingue por su base, es decir, el número de símbolos que usa.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Sistema Decimal (base 10)", subtitulo);

                                agregarTexto(doc, """
                                \n\nEs el sistema que usamos en la vida cotidiana. Tiene 10 dígitos:

                                0, 1, 2, 3, 4, 5, 6, 7, 8, 9

                                Cada posición vale una potencia de 10.""", normal);

                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\n427 = 4x10² + 2x10¹ + 7x10⁰", normalC);
                                agregarTexto(doc, """
                                \nEl valor posicional permite representar cualquier número con solo 10 símbolos.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Sistema Binario (base 2)", subtitulo);
                                agregarTexto(doc, """
                                \n\nEs el sistema fundamental de las computadoras. Solo utiliza dos dígitos:

                                0 y 1

                                Cada posición vale una potencia de 2.""", normal);
                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\n1011₂ = 1x2³ + 0x2² + 1x2¹ + 1x2⁰", normalC);
                                agregarTexto(doc, """
                                \nEl binario representa:
                                • '0' = apagado
                                • '1' = encendido
                                por lo que es ideal para sistemas digitales.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Sistema Octal (base 8)", subtitulo);
                                agregarTexto(doc, """
                                \n\nUsa 8 símbolos:

                                0, 1, 2, 3, 4, 5, 6, 7

                                Cada posición vale una potencia de 8.""", normal);
                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\n157₈ = 1×8² + 5×8¹ + 7×8⁰", normalC);
                                agregarTexto(doc, """
                                \nEl octal se usa como forma compacta del binario porque:
                                • 1 dígito octal = 3 bits binarios.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Sistema Hexadecimal (base 16)", subtitulo);
                                agregarTexto(doc, """
                                \n\nUsa 16 símbolos:

                                0 1 2 3 4 5 6 7 8 9 A B C D E F

                                Las letras representan valores:
                                A=10, B=11, C=12, D=13, E=14, F=15""", normal);
                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\n2F₁₆ = 2×16¹ + 15×16⁰", normalC);
                                agregarTexto(doc, """
                                \nEs ampliamente usado en computación porque:
                                • 1 dígito hexadecimal = 4 bits binarios.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Conversión entre sistemas numéricos", subtitulo);
                                agregarTexto(doc, """
                                \n• Binario → Octal: agrupar de 3 en 3 bits
                                • Binario → Hexadecimal: agrupar de 4 en 4 bits
                                • Decimal → Otro sistema: dividir entre la base y tomar residuos
                                • Otro sistema → Decimal: aplicar suma de potencias""", normal);

                                agregarTexto(doc, """
                                \nEstas conversiones permiten trabajar con datos en diferentes niveles
                                desde hardware (binario) hasta programación (hexadecimal).""", normalCIB);
                                text.setCaretPosition(0);
                            }
                            case 2 -> {
                                agregarTexto(doc, """
                                Las conversiones permiten transformar un número de un sistema a otro.
                                Son esenciales en matemáticas discretas y computación, porque cada sistema
                                (binario, octal, decimal, hexadecimal) usa una base distinta.""", normal);
                                agregarTexto(doc, """
                                \nPara convertir correctamente, es importante conocer:
                                • La base de cada sistema.
                                • Cómo obtener residuos y potencias.
                                • Cómo agrupar bits para conversiones rápidas.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Conversión de Decimal a otros sistemas", subtitulo);
                                agregarTexto(doc, """
                                \n\nPara convertir un número decimal a otra base se usan divisiones sucesivas.
                                El número se divide entre la nueva base y se toman los residuos.""", normal);
                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\n25₁₀ → 11001₂", normalC);
                                agregarTexto(doc, """
                                \n• Decimal → Binario: dividir entre 2.
                                • Decimal → Octal: dividir entre 8.
                                • Decimal → Hexadecimal: dividir entre 16.
                                Los residuos, leídos al revés, forman el número convertido.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Conversión de Binario a Decimal", subtitulo);
                                agregarTexto(doc, """
                                \nSe realiza usando la suma de potencias de 2.
                                Cada dígito multiplica una potencia según su posición.""", normal);
                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\n11001₂ = 1×2⁴ + 1x2³ + 0×2² ...", normalC);
                                agregarTexto(doc, """
                                \nEste método permite interpretar cualquier número binario como una suma
                                de potencias de 2.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Conversión de Binario a Octal y Hexadecimal", subtitulo);
                                agregarTexto(doc, """
                                \nEstas conversiones son rápidas usando agrupaciones:
                                • Binario → Octal: agrupar bits de 3 en 3.
                                • Binario → Hexadecimal: agrupar bits de 4 en 4.
                                Luego se reemplaza cada grupo por su equivalente.""", normal);
                                agregarTexto(doc, """
                                \nEste método evita cálculos y se usa mucho en programación y electrónica.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Conversión Octal ↔ Hexadecimal", subtitulo);
                                agregarTexto(doc, """
                                \nNo existe una conversión directa.
                                El proceso correcto es usar el binario como puente:
                                • Octal → Binario → Hexadecimal
                                • Hexadecimal → Binario → Octal""", normal);
                                agregarTexto(doc, "\nEjemplo:", nota);
                                agregarTexto(doc, "\n157₈ → 1101111₂ → 6F₁₆", normalC);
                                agregarTexto(doc, """
                                \nEsto funciona porque:
                                • 1 dígito octal = 3 bits.
                                • 1 dígito hexadecimal = 4 bits.""", normalCIB);
                                agregarTexto(doc, "\n\n🔸 Resumen rápido de conversiones", subtitulo);
                                agregarTexto(doc, """
                                \n• Decimal → Otro sistema → divisiones sucesivas.
                                • Binario → Decimal → potencias de 2.
                                • Binario ↔ Octal → grupos de 3 bits.
                                • Binario ↔ Hex → grupos de 4 bits.
                                • Octal ↔ Hex → convertir usando binario.""", normal);
                                agregarTexto(doc, """
                                \nEstas conversiones permiten comprender cómo manejan datos las computadoras
                                desde el nivel más básico (bits) hasta representaciones más compactas como hexadecimales.""", normalCIB); 
                                text.setCaretPosition(0);
                            }
                        }
                    }
                }
            }
        }
    }
    
    //ACTIVIDADES
    
    public static void crearEjerciciosPanel(String curso, int unidad, int leccion, int cantidad, int rango){
        frameTamaño(460,350, "Learnify(Ejercicios)");
        
        JPanel ejerciciosPanel = crearPanel(true, "ejercicios");

        //GENERAR ALEATORIDAD
        int numerosRan[] = new int[cantidad];
        numerosRan[0] = (int)(Math.random()*rango);
        if(cantidad > rango){
            JOptionPane.showMessageDialog(null, "No se genero la aleatoridad", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        for (int i = 1; i < cantidad; i++) {
            numerosRan[i] = (int)(Math.random()*rango);
            for (int j = 0; j < i; j++) {
                if(numerosRan[i] == numerosRan[j]){
                    i--;
                    break;
                }
            }  
        }
        generarEjercicios(curso, unidad, leccion, ejerciciosPanel, numerosRan, 0, rango, cantidad);  
    }
    public static void generarEjercicios(String curso,int unidad, int leccion, JPanel panel, int[] numerosRan, int i, int rango, int cantidad){
        int ejercicio = -1;
        int x = i + 1;
        
        limpiarPaneles(panel);
        
        JTextArea text = crearTexto(panel, null, false, false, "Calibri", 22, 0, 0, 0, 0);
        
        JButton volver = crearBotones("Volver", false, null
                                        , 0, 292, 70, 20, panel);
        
        JButton continuar = crearBotones("Continuar", false, null
                                        , 355, 292, 89, 20, panel);
        continuar.setEnabled(false);
        
        JButton verificar = crearBotones("Verificar", false, null
                                        , 240, 292, 83, 20, panel);
        //Importante
        JLabel ejercico = crearTexto(panel);
        JTextField respuesta = crearAreaRespuesta(panel, 0, 0, 0, 0, false);
        JRadioButton botonCorrecto = crearRadioButton(null, 0, 0, null, 0, 0 ,0, 0 , false, panel);
        
        
        JLabel correcto = crearLabelImagen(panel,correctoImg,0,0,0,0);
        correcto.setVisible(false);
        JLabel incorrecto = crearLabelImagen(panel,incorrectoImg,0,0,0,0);
        incorrecto.setVisible(false);

        try{
             ejercicio = numerosRan[i];
             //ejercicio = 15;
        }catch(ArrayIndexOutOfBoundsException e){
            panel.remove(continuar);
            finalizarEjercicios(curso, unidad, leccion, cantidad, rango);
            layout.show(panelPrincipal, "terminar");
        }

        if(i == 0 || x <= rango )
            continuar.addActionListener(e -> {generarEjercicios(curso, unidad, leccion, panel, numerosRan, x, rango, cantidad);});

        switch(curso){
            case "calculo" ->{
                switch(unidad){
                    case 1 ->{
                        switch(leccion){
                            case 1->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Escribe correctamente a qué conjunto"
                                                + "\npertenece el siguiente número: ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearLabelImagen(panel, fraccionEjercicio, 50, 125, 100, 100);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Escribe correctamente a qué conjunto"
                                                + "\npertenece el siguiente número: ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("0", 40, Font.BOLD, "Cambria Math", 90, 150, 50, 50, ejercico);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Escribe correctamente a qué conjunto"
                                                + "\npertenece el siguiente número: ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("-7", 40, Font.BOLD, "Cambria Math", 80, 150, 50, 50, ejercico);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Escribe correctamente a qué conjunto"
                                                + "\npertenece el siguiente número: ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearLabelImagen(panel, fraccionEjercicio2, 50, 125, 100, 100);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 4;
                                    }
                                    case 4 ->{
                                        actualizarTexto("Escribe correctamente a qué conjunto"
                                                + "\npertenece el siguiente número: ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("π", 40, Font.ITALIC, "Cambria Math", 80, 148, 50, 50, ejercico);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 5;
                                    }
                                    case 5 ->{
                                        actualizarTexto("Escribe correctamente cual número es "
                                                + "\nmayor que otro o igual (< , > o =): ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("37         6·6", 40, Font.BOLD, "Cambria Math", 120, 30, 300, 300, ejercico);
                                        actualizarTextField(true, 190, 160, 30, 30, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 148, 50, 50);
                                        actividad = 6;
                                    }
                                    case 6 ->{
                                        actualizarTexto("Escribe correctamente cual número es "
                                                + "\nmayor que otro o igual (< , > o =): ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("–17         –4²", 40, Font.BOLD, "Cambria Math", 100, 30, 300, 300, ejercico);
                                        actualizarTextField(true, 190, 160, 30, 30, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 148, 50, 50);
                                        actividad = 7;
                                    }
                                    case 7 ->{
                                        
                                        actualizarTexto("Escribe correctamente cual número es "
                                                + "\nmayor que otro o igual (< , > o =): ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearLabelImagen(panel, fraccionEjercicio3, 80, 130, 100, 100);
                                        actualizarTexto("0.75", 40, Font.BOLD, "Cambria Math", 250, 30, 300, 300, ejercico);
                                        actualizarTextField(true, 190, 160, 30, 30, respuesta);
                                        correcto.setBounds(340, 146, 50, 50);
                                        incorrecto.setBounds(340, 148, 50, 50);
                                        actividad = 8;
                                    }
                                    case 8 ->{
                                        actualizarTexto("Escribe correctamente cual número es "
                                                + "\nmayor que otro o igual (< , > o =): ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioRaiz, 80, 130, 100, 100);
                                        actualizarTexto("2.22", 40, Font.BOLD, "Cambria Math", 250, 30, 300, 300, ejercico);
                                        actualizarTextField(true, 190, 160, 30, 30, respuesta);
                                        correcto.setBounds(340, 146, 50, 50);
                                        incorrecto.setBounds(340, 148, 50, 50);
                                        actividad = 9;
                                    }
                                    case 9 ->{
                                        actualizarTexto("Escribe correctamente cual número es "
                                                + "\nmayor que otro o igual (< , > o =): ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioRaiz2, 80, 125, 100, 100);     
                                        crearLabelImagen(panel, ejercicioRaiz3, 250, 125, 100, 100); 
                                        actualizarTextField(true, 190, 160, 30, 30, respuesta);
                                        correcto.setBounds(340, 146, 50, 50);
                                        incorrecto.setBounds(340, 148, 50, 50);
                                        actividad = 10;
                                    }
                                    case 10 ->{
                                        actualizarTexto("Escribe correctamente si es irracional "
                                                + "\no racional:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioRaiz4, 50, 125, 100, 100);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 11;
                                    }
                                    case 11 ->{
                                        actualizarTexto("Escribe correctamente si es irracional "
                                                + "\no racional:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearTexto(panel, "_", 60, Font.BOLD, "Cambria Math", 95, 80, 200, 100);
                                        actualizarTexto("0.4", 40, Font.BOLD, "Cambria Math", 60, 125, 100, 100, ejercico);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 12;
                                    }
                                    case 12 ->{
                                        actualizarTexto("Escribe correctamente si es irracional "
                                                + "\no racional:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioRaiz5, 50, 125, 100, 100);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 13;
                                    }
                                    case 13 ->{
                                        actualizarTexto("Escribe correctamente si es irracional "
                                                + "\no racional:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        crearLabelImagen(panel, fraccionEjercicio4, 50, 125, 100, 100);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 14;
                                    }
                                    case 14 ->{
                                        actualizarTexto("Escribe correctamente si es irracional "
                                                + "\no racional:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("e", 40, Font.ITALIC, "Cambria Math", 80, 148, 50, 50, ejercico);
                                        actualizarTextField(true, 140, 160, 180, 25, respuesta);
                                        correcto.setBounds(330, 146, 50, 50);
                                        incorrecto.setBounds(330, 146, 50, 50);
                                        actividad = 15;
                                    }
                                }
                            }
                            case 2->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Convierte a desigualdad el intervalo:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("[−2 , 5)", 30, Font.BOLD, "Cambria Math", 60, 150, 200, 50, ejercico);                                        
                                        actualizarTextField(true, 170, 160, 180, 25, respuesta);
                                        correcto.setBounds(360, 146, 50, 50);
                                        incorrecto.setBounds(360, 146, 50, 50);
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Selecciona la notación del intervalo "
                                                + "\ncorrecto del conjunto:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("{x ∈ R ∣ x > 3}", 30, Font.BOLD, "Cambria Math", 40, 150, 200, 50, ejercico);
                                        actualizarRadioButton(true, "(3 , ∞)", 18, Font.BOLD, "Cambria Math", 260, 120 ,80, 30 , botonCorrecto);
                                        crearRadioButton("(3 , ∞]", 18, Font.BOLD, "Cambria Math", 260, 160 ,80, 30 , true, panel);
                                        crearRadioButton("[3 , ∞)", 18, Font.BOLD, "Cambria Math", 260, 200 ,80, 30 , true, panel); 
                                        correcto.setBounds(350, 146, 50, 50);
                                        incorrecto.setBounds(350, 146, 50, 50);
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Determina si el número ' 7 ' pertenece"
                                                + "\nal intervalo:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("(2 , 7)", 40, Font.BOLD, "Cambria Math", 60, 150, 200, 50, ejercico);  
                                        
                                        actualizarRadioButton(true, "No pertenece", 18, Font.BOLD, "Calibri", 230, 190 ,150, 30, botonCorrecto);
                                        crearRadioButton("Pertenece", 18, Font.BOLD, "Calibri", 230, 120 ,150, 30, true, panel);
                                        correcto.setBounds(380, 142, 50, 50);
                                        incorrecto.setBounds(380, 142, 50, 50);
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Escribe en notación de intervalo "
                                                + "\nlo siguiente:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("−4 ≤ x ≤ 10", 30, Font.BOLD, "Cambria Math", 40, 150, 200, 50, ejercico);  
                                        actualizarTextField(true, 230, 160, 150, 25, respuesta);
                                        correcto.setBounds(390, 146, 50, 50);
                                        incorrecto.setBounds(390, 146, 50, 50);
                                        actividad = 4;
                                    }
                                    case 4 ->{
                                        actualizarTexto("Escoge el intervalo del conjunto:", 22, Font.BOLD, "Calibri", 30, 40, 500, 90, text);
                                        actualizarTexto("{x ∈ R ∣ x < −1 o x ≥ 4}", 30, Font.BOLD, "Cambria Math", 30, 100, 350, 50, ejercico);
                                        
                                        actualizarRadioButton(true, "(−∞ , −1) ∪ [4 , ∞)", 18, Font.BOLD, "Cambria Math", 30, 160 ,180, 30 , botonCorrecto);
                                        crearRadioButton("(−∞ , −1] ∪ [4 , ∞)", 18, Font.BOLD, "Cambria Math", 30, 200 ,180, 30 , true, panel);
                                        crearRadioButton("[4 , ∞) ∪ (−∞ , −1)", 18, Font.BOLD, "Cambria Math", 230, 160 ,180, 30 , true, panel); 
                                        crearRadioButton("(4 , ∞) ∪ (−∞ , −1)", 18, Font.BOLD, "Cambria Math", 230, 200 ,180, 30 , true, panel);
                                        
                                        correcto.setBounds(370, 95, 50, 50);
                                        incorrecto.setBounds(370, 95, 50, 50);
                                        actividad = 5;
                                    }
                                    case 5 ->{
                                        actualizarTexto("Determina si el número ' 2 ' pertenece"
                                                + "\nal intervalo:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("(−∞ , 2]", 40, Font.BOLD, "Cambria Math", 60, 150, 200, 50, ejercico);  
                                        actualizarRadioButton(true, "Pertenece", 18, Font.BOLD, "Calibri", 230, 120 ,150, 30 , botonCorrecto);
                                        crearRadioButton("No pertenece", 18, Font.BOLD, "Calibri", 230, 190 ,150, 30 , true, panel);
                                        correcto.setBounds(380, 142, 50, 50);
                                        incorrecto.setBounds(380, 142, 50, 50);
                                        actividad = 6;
                                    }
                                    case 6 ->{
                                        actualizarTexto("Selecciona el intervalo que representa todos"
                                                + "\nlos números reales mayores o iguales que -7 ", 21, Font.BOLD, "Calibri", 30, 25, 500, 90, text);
                                        actualizarRadioButton(true, "[−7 , ∞)", 18, Font.BOLD, "Cambria Math", 240, 130 ,100, 30 , botonCorrecto);
                                        crearRadioButton("[−7 , ∞]", 18, Font.BOLD, "Cambria Math", 80, 190 ,100, 30 , true, panel);
                                        crearRadioButton("[−7 , ∞)", 18, Font.BOLD, "Cambria Math", 80, 130 ,100, 30 , true, panel); 
                                        crearRadioButton("(−7 , ∞)", 18, Font.BOLD, "Cambria Math", 240, 190 ,100, 30 , true, panel);
                                        correcto.setBounds(380, 146, 50, 50);
                                        incorrecto.setBounds(380, 148, 50, 50);
                                        actividad = 7;
                                    }
                                    case 7 ->{
                                        
                                        actualizarTexto("Convierte a desigualdad el intervalo: ", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("(−∞ , 0)", 30, Font.BOLD, "Cambria Math", 40, 150, 200, 50, ejercico);                                        
                                        actualizarTextField(true, 170, 160, 180, 25, respuesta);
                                        correcto.setBounds(360, 146, 50, 50);
                                        incorrecto.setBounds(360, 146, 50, 50);
                                        actividad = 8;
                                    }
                                    case 8 ->{
                                        actualizarTexto("Selecciona el intervalo que representa:", 21, Font.BOLD, "Calibri", 30, 25, 500, 90, text);
                                        actualizarTexto("Todos los números reales excepto el 5", 20, Font.BOLD, "Cambria Math", 30, -80, 500, 300, ejercico);
                                        actualizarRadioButton(true, "(−∞ , 5) ∪ (5 , ∞)", 18, Font.BOLD, "Cambria Math", 240, 190 ,180, 30, botonCorrecto);
                                        crearRadioButton("(−∞ , 5] ∪ (5 , ∞)", 18, Font.BOLD, "Cambria Math", 40, 190 ,180, 30, true, panel);
                                        crearRadioButton("(−∞ , 5] ∪ [5 , ∞)", 18, Font.BOLD, "Cambria Math", 240, 130 ,180, 30, true, panel); 
                                        crearRadioButton("(−∞ , 5) ∪ [5 , ∞)", 18, Font.BOLD, "Cambria Math", 40, 130 ,180, 30, true, panel);
                                        correcto.setBounds(390, 35, 50, 50);
                                        incorrecto.setBounds(390, 35, 50, 50);
                                        actividad = 9;
                                    }
                                    case 9 ->{
                                        actualizarTexto("Escribe en notación de intervalo "
                                                + "\nel conjunto:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("−3 < x ≤ 2", 30, Font.BOLD, "Cambria Math", 40, 150, 200, 50, ejercico);  
                                        actualizarTextField(true, 230, 160, 150, 25, respuesta);
                                        correcto.setBounds(390, 146, 50, 50);
                                        incorrecto.setBounds(390, 146, 50, 50);
                                        actividad = 10;
                                    }
                                    case 10 ->{
                                        actualizarTexto("Determina el tipo de intervalo"
                                                + "\nque representa:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("[4 , 9)", 32, Font.BOLD, "Cambria Math", 80, 150, 200, 50, ejercico);  
                                        actualizarTextField(true, 220, 160, 150, 25, respuesta);
                                        correcto.setBounds(380, 146, 50, 50);
                                        incorrecto.setBounds(380, 146, 50, 50);
                                        actividad = 11;
                                    }
                                    case 11 ->{
                                        actualizarTexto("Convierte el siguiente intervalo "
                                                + "\na desigualdad:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);      
                                        actualizarTexto("(1 , 6)", 30, Font.BOLD, "Cambria Math", 60, 150, 200, 50, ejercico);                                        
                                        actualizarTextField(true, 170, 160, 180, 25, respuesta);
                                        correcto.setBounds(360, 146, 50, 50);
                                        incorrecto.setBounds(360, 146, 50, 50);
                                        actividad = 12;
                                    }
                                    case 12 ->{
                                        actualizarTexto("Selecciona el intervalo correspondiente a:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("Números menores o iguales que 10", 20, Font.BOLD, "Cambria Math", 30, -80, 500, 300, ejercico);
                                        actualizarRadioButton(true, "(−∞,10]", 18, Font.BOLD, "Cambria Math", 240, 190 ,180, 30, botonCorrecto);
                                        crearRadioButton("[−∞,10)", 18, Font.BOLD, "Cambria Math", 40, 190 ,180, 30, true, panel);
                                        crearRadioButton("(−∞,10)", 18, Font.BOLD, "Cambria Math", 240, 130 ,180, 30, true, panel); 
                                        crearRadioButton("[−∞,10]", 18, Font.BOLD, "Cambria Math", 40, 130 ,180, 30, true, panel);
                                        
                                        correcto.setBounds(390, 35, 50, 50);
                                        incorrecto.setBounds(390, 35, 50, 50);
                                        actividad = 13;
                                    }
                                    case 13 ->{
                                        actualizarTexto("Indica si el intervalo incluye el número ' 7 '"
                                                + "\ny si incluye el número ' 10 '.", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("(−∞ , 7]", 30, Font.BOLD, "Cambria Math", 60, 150, 200, 50, ejercico);  
                                        actualizarRadioButton(true, "Incluye solo a uno", 18, Font.BOLD, "Calibri", 230, 160 ,170, 30 , botonCorrecto);
                                        crearRadioButton("No los incluye", 18, Font.BOLD, "Calibri", 230, 200 ,150, 30 , true, panel);
                                        crearRadioButton("Los incluye", 18, Font.BOLD, "Calibri", 230, 120 ,150, 30 , true, panel);
                                        correcto.setBounds(380, 100, 50, 50);
                                        incorrecto.setBounds(380, 100, 50, 50);
                                        actividad = 14;
                                    }
                                    case 14 ->{
                                        actualizarTexto("¿Cuál es el intervalo de "
                                                + "\nla siguiente expresion?", 22, Font.BOLD, "Calibri", 120, 20, 500, 90, text);
                                        actualizarTexto("x ≥ −5", 30, Font.BOLD, "Cambria Math", 70, 150, 200, 50, ejercico);  
                                        actualizarRadioButton(true, "[−5 , ∞)", 18, Font.BOLD, "Cambria Math", 200, 190 ,95, 30 , botonCorrecto);
                                        crearRadioButton("(−5 , ∞)", 18, Font.BOLD, "Cambria Math", 300, 130 ,95, 30 , true, panel);
                                        crearRadioButton("(∞ , -5]", 18, Font.BOLD, "Cambria Math", 200, 130 ,95, 30 , true, panel); 
                                        crearRadioButton("(∞ , -5)", 18, Font.BOLD, "Cambria Math", 300, 190 ,95, 30 , true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 15;
                                    }
                                }
                            }
                            case 3->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Identifica la variable independiente", 22, Font.BOLD, "Calibri", 60, 40, 500, 90, text);
                                        actualizarTexto("f(x) = 3x −7", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);                
                                        crearTexto(panel, "Variable dependiente:", 22, Font.BOLD, "Calibri", 30, 140, 250, 100);
                                        actualizarTextField(true, 250, 175, 50, 25, respuesta);
                                        correcto.setBounds(310, 160, 50, 50);
                                        incorrecto.setBounds(310, 160, 50, 50);
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Identifica si es una función el siguiente"
                                                + "\nconjunto de pares:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("(1,4),(2,6),(1,7)", 28, Font.BOLD, "Cambria Math", 110, 110, 250, 50, ejercico);   
                                        actualizarRadioButton(true, "No es una funcion", 18, Font.BOLD, "Calibri", 230, 180 ,170, 30, botonCorrecto);
                                        crearRadioButton("Es una funcion", 18, Font.BOLD, "Calibri", 50, 180 ,150, 30, true, panel);                                        
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Dado el conjunto de pares, selecciona"
                                                + "\nsi es función o no", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("(3,8),(4,2),(5,1),(3,9)", 28, Font.BOLD, "Cambria Math", 80, 110, 300, 50, ejercico);   
                                        actualizarRadioButton(true, "No es una funcion", 18, Font.BOLD, "Calibri", 230, 180 ,170, 30, botonCorrecto);
                                        crearRadioButton("Es una funcion", 18, Font.BOLD, "Calibri", 50, 180 ,150, 30, true, panel);                                        
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Para la siguiente función determina el"
                                                + "\nvalor de la variable dependiente si x = 0:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x² + 1", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        crearTexto(panel, "f(0) =", 22, Font.BOLD, "Cambria Math", 90, 140, 250, 100);
                                        actualizarTextField(true, 180, 175, 150, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 4;
                                    }
                                    case 4 ->{
                                        actualizarTexto("Escribe el rango de la función:", 22, Font.BOLD, "Calibri", 40, 40, 500, 90, text);
                                        actualizarTexto("f(x) = x²", 30, Font.BOLD, "Cambria Math", 80, 150, 200, 50, ejercico);
                                        actualizarRadioButton(true, "[0 , ∞)", 18, Font.BOLD, "Cambria Math", 260, 160 ,80, 30 , botonCorrecto);
                                        crearRadioButton("(0 , ∞)", 18, Font.BOLD, "Cambria Math", 260, 120 ,80, 30 , true, panel);
                                        crearRadioButton("(-∞ , ∞)", 18, Font.BOLD, "Cambria Math", 260, 200 ,90, 30 , true, panel); 
                                        correcto.setBounds(350, 146, 50, 50);
                                        incorrecto.setBounds(350, 146, 50, 50);
                                        actividad = 5;
                                    }
                                    case 5 ->{
                                        actualizarTexto("Dado el siguiente conjunto de pares,"
                                                + "\nescribe la variable independiente:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("(1,4),(2,6),(1,7)", 28, Font.BOLD, "Cambria Math", 110, 110, 250, 50, ejercico);
                                        crearTexto(panel, "Variable independiente:", 22, Font.BOLD, "Calibri", 50, 140, 250, 100);
                                        actualizarTextField(true, 290, 175, 50, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 6;
                                    }
                                    case 6 ->{
                                        actualizarTexto("Selecciona la descripción en notación "
                                                + "\nde dominio del texto:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("Todos los valores reales excepto x = −1", 20, Font.BOLD, "Cambria Math", 30, -60, 500, 300, ejercico);
                                        actualizarRadioButton(true, "(−∞,−1) ∪ (−1,∞)", 18, Font.BOLD, "Cambria Math", 240, 190 ,180, 30, botonCorrecto);
                                        crearRadioButton("(−∞,−1] ∪ [−1,∞)", 18, Font.BOLD, "Cambria Math", 40, 190 ,180, 30, true, panel);
                                        crearRadioButton("(∞,−1] ∪ [1,−∞)", 18, Font.BOLD, "Cambria Math", 240, 130 ,180, 30, true, panel); 
                                        crearRadioButton("(∞,−1) ∪ (−1,−∞)", 18, Font.BOLD, "Cambria Math", 40, 130 ,180, 30, true, panel);
                                        correcto.setBounds(400, 60, 50, 50);
                                        incorrecto.setBounds(400, 60, 50, 50);
                                        actividad = 7;
                                    }
                                    case 7 ->{
                                        actualizarTexto("Para la siguiente función determina el"
                                                + "\nvalor de la variable dependiente si x = 3:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x² + 1", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        crearTexto(panel, "f(3) =", 22, Font.BOLD, "Cambria Math", 90, 140, 250, 100);
                                        actualizarTextField(true, 180, 175, 150, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 8;
                                    }
                                    case 8 ->{
                                        actualizarTexto("Para la siguiente función determina el"
                                                + "\nvalor de la variable dependiente si x = 8:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 2x + 5", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        crearTexto(panel, "f(8) =", 22, Font.BOLD, "Cambria Math", 90, 140, 250, 100);
                                        actualizarTextField(true, 180, 175, 150, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 9;
                                    }
                                    case 9 ->{
                                        actualizarTexto("Para la siguiente función determina el"
                                                + "\nvalor de la variable dependiente si x = 3:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 3 ⋅ 2ˣ", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        crearTexto(panel, "f(3) =", 22, Font.BOLD, "Cambria Math", 90, 140, 250, 100);
                                        actualizarTextField(true, 180, 175, 150, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 10;
                                    }
                                }
                            }
                            case 4->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Evalúa la siguiente función:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 4x − 3", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        crearTexto(panel, "f(0) =", 22, Font.BOLD, "Cambria Math", 90, 140, 250, 100);
                                        actualizarTextField(true, 180, 175, 150, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Evalúa la siguiente función:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 4x − 3", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        crearTexto(panel, "f(2) =", 22, Font.BOLD, "Cambria Math", 90, 140, 250, 100);
                                        actualizarTextField(true, 180, 175, 150, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Evalúa la siguiente función:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 4x − 3", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        crearTexto(panel, "f(-1) =", 22, Font.BOLD, "Cambria Math", 90, 140, 250, 100);
                                        actualizarTextField(true, 180, 175, 150, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Determina si lo siguiente es representación"
                                                + "\nanalítica, numérica, gráfica o verbal:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("f(x) toma un número y lo divide entre 2", 18, Font.BOLD, "Cambria Math", 50, -20, 500, 300, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 4;
                                    }  
                                    case 4 ->{
                                        actualizarTexto("¿Es una función real de variable real"
                                                + "\npara todos los números reales?", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x - 4", 40, Font.BOLD, "Cambria Math", 60, 150, 200, 50, ejercico);  
                                        actualizarRadioButton(true, "Si", 18, Font.BOLD, "Calibri", 330, 130 ,70, 30, botonCorrecto);
                                        crearRadioButton("No", 18, Font.BOLD, "Calibri", 330, 180 ,70, 30, true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 5;
                                    }  
                                    case 5 ->{
                                        actualizarTexto("Una gráfica en forma de ' U ' corresponde"
                                                + "\na qué tipo de función:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarRadioButton(true, "Cuadrática", 18, Font.BOLD, "Calibri", 50, 120 ,150, 30 , botonCorrecto);
                                        crearRadioButton("Exponencial", 18, Font.BOLD, "Calibri", 50, 190 ,150, 30 , true, panel);
                                        crearRadioButton("Lineal", 18, Font.BOLD, "Calibri", 230, 120 ,150, 30 , true, panel); 
                                        crearRadioButton("Trigonométrica", 18, Font.BOLD, "Calibri", 230, 190 ,150, 30 , true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 6;
                                    }  
                                    case 6 ->{
                                        actualizarTexto("Escribe una representación analítica a "
                                                + "\npartir de la descripción verbal:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto(" La función toma un número y lo multiplica por 7 ", 18, Font.BOLD, "Cambria Math", 20, -20, 500, 300, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 7;
                                    }  
                                    case 7 ->{
                                        actualizarTexto("Dado el conjunto de pares, selecciona"
                                                + "\nsi es función o no", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("(1,3),(2,6),(1,8)", 28, Font.BOLD, "Cambria Math", 110, 110, 250, 50, ejercico);
                                        actualizarRadioButton(true, "No es una funcion", 18, Font.BOLD, "Calibri", 230, 180 ,170, 30, botonCorrecto);
                                        crearRadioButton("Es una funcion", 18, Font.BOLD, "Calibri", 50, 180 ,150, 30, true, panel);                                        
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 8;
                                    }  
                                    case 8 ->{
                                        actualizarTexto("Dado el conjunto de pares, selecciona"
                                                + "\nsi es función o no", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto("(2,3),(5,4),(3,10)", 28, Font.BOLD, "Cambria Math", 110, 110, 250, 50, ejercico);
                                        actualizarRadioButton(true, "Es una funcion", 18, Font.BOLD, "Calibri", 50, 180 ,150, 30, botonCorrecto);
                                        crearRadioButton("No es una funcion", 18, Font.BOLD, "Calibri", 230, 180 ,170, 30, true, panel);                                        
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);

                                        actividad = 9;
                                    }  
                                    case 9 ->{
                                        actualizarTexto("Escribe una representación analítica a "
                                                + "\npartir de la descripción verbal:", 22, Font.BOLD, "Calibri", 30, 20, 500, 90, text);
                                        actualizarTexto(" La función toma un número y le resta 5 ", 18, Font.BOLD, "Cambria Math", 60, -20, 500, 300, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 10;
                                    }  
                                }
                            }
                            case 5->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Clasifica la siguiente función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = 4x − 7", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Determina si la siguiente función"
                                                + "\nes polinomial:", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncion, 70, 40, 500, 200);
                                        actualizarRadioButton(true, "No es polinomial", 18, Font.BOLD, "Calibri", 220, 190 ,160, 30, botonCorrecto);
                                        crearRadioButton("Si es polinomial", 18, Font.BOLD, "Calibri", 50, 190 ,150, 30, true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Identifica si la función es racional:", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncion2, 90, 40, 500, 200);
                                        actualizarRadioButton(true, "Si es racional", 18, Font.BOLD, "Calibri", 50, 190 ,150, 30, botonCorrecto);
                                        crearRadioButton("No es racional", 18, Font.BOLD, "Calibri", 220, 190 ,160, 30, true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Identifica si la función es algebraica:", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncion3, 90, 40, 500, 200);
                                        actualizarRadioButton(true, "Si es algebraica", 18, Font.BOLD, "Calibri", 50, 190 ,150, 30, botonCorrecto);
                                        crearRadioButton("No es algebraica", 18, Font.BOLD, "Calibri", 220, 190 ,160, 30, true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 4;
                                    }  
                                    case 4 ->{
                                        actualizarTexto("Identifica si la función es polinomial:", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncion4, 90, 40, 500, 200);
                                        actualizarRadioButton(true, "No es polinomial", 18, Font.BOLD, "Calibri", 220, 190 ,160, 30, botonCorrecto);
                                        crearRadioButton("Si es polinomial", 18, Font.BOLD, "Calibri", 50, 190 ,150, 30, true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 5;
                                    }  
                                    case 5 ->{
                                        actualizarTexto("Selecciona el tipo de función:", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncion5, 90, 40, 500, 200);
                                        actualizarRadioButton(true, "Racional", 18, Font.BOLD, "Calibri", 170, 190 ,110, 30, botonCorrecto);
                                        crearRadioButton("Algebraica", 18, Font.BOLD, "Calibri", 20, 190 ,110, 30, true, panel);
                                        crearRadioButton("Polinomial", 18, Font.BOLD, "Calibri", 300, 190 ,110, 30, true, panel);
                                        correcto.setBounds(390, 90, 50, 50);
                                        incorrecto.setBounds(390, 90, 50, 50);
                                        actividad = 6;
                                    }  
                                    case 6 ->{
                                        actualizarTexto("Clasifica la siguiente función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = x⁴ −3x + 2", 30, Font.BOLD, "Cambria Math", 100, 110, 250, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 7;
                                    }  
                                    case 7 ->{
                                        actualizarTexto("Clasifica la siguiente función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = 8x - 5", 30, Font.BOLD, "Cambria Math", 140, 110, 250, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 8;
                                    }  
                                    case 8 ->{
                                        actualizarTexto("Completa:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("Una función racional siempre tiene la forma:", 19, Font.BOLD, "Cambria Math", 30, 100, 500, 50, ejercico);
                                        actualizarRadioButton(true, "División", 18, Font.BOLD, "Calibri", 260, 190 ,100, 30, botonCorrecto);
                                        crearRadioButton("Multiplicación", 18, Font.BOLD, "Calibri", 70, 190 ,150, 30, true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 9;
                                    }  
                                    case 9 ->{
                                        actualizarTexto("Clasifica la siguiente función:", 20, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = 25x² - 2x - 10", 26, Font.BOLD, "Cambria Math", 100, 110, 300, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 10;
                                    }  
                                }
                            }
                            case 6->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Identifica el tipo de función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = log(x)", 30, Font.BOLD, "Cambria Math", 130, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("¿Qué tipo de fenómeno modelan comúnmente"
                                                + "\nlas funciones trigonométricas?", 20, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        actualizarRadioButton(true, "Ondas", 18, Font.BOLD, "Calibri", 50, 120 ,150, 30 , botonCorrecto);
                                        crearRadioButton("Crecimiento rápido", 18, Font.BOLD, "Calibri", 50, 190 , 180, 30 , true, panel);
                                        crearRadioButton("Procesos lineales", 18, Font.BOLD, "Calibri", 230, 120 , 180, 30 , true, panel); 
                                        crearRadioButton("Ninguna", 18, Font.BOLD, "Calibri", 230, 190 , 150, 30 , true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Identifica el tipo de función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = 3eˣ", 30, Font.BOLD, "Cambria Math", 150, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Clasifica la función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = sen(x) + ln(x)", 30, Font.BOLD, "Cambria Math", 80, 110, 400, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 4;
                                    }  
                                    case 4 ->{
                                        actualizarTexto("Identifica el tipo de función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = 4sen(x)", 30, Font.BOLD, "Cambria Math", 120, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 5;
                                    }  
                                    case 5 ->{
                                        actualizarTexto("Selecciona por qué el seno es una función periódica:", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        actualizarRadioButton(true, "Porque repite su patrón", 18, Font.BOLD, "Calibri", 120, 120 , 280, 30 , botonCorrecto);
                                        crearRadioButton("Porque crece sin límite", 18, Font.BOLD, "Calibri", 120, 210 , 250, 30 , true, panel);
                                        crearRadioButton("Porque es inversa de e^x", 18, Font.BOLD, "Calibri", 120, 165 ,280, 30 , true, panel); 
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 6;
                                    }  
                                    case 6 ->{
                                        actualizarTexto("¿Las funciones trigonométricas son"
                                                + "\ntrascendentes?", 20, Font.BOLD, "Calibri", 20, 30, 500, 90, text);
                                        actualizarRadioButton(true, "Si son trascendentes", 18, Font.BOLD, "Calibri", 30, 160 ,180 , 30, botonCorrecto);
                                        crearRadioButton("No son trascendentes", 18, Font.BOLD, "Calibri", 230, 160 ,190 , 30, true, panel);
                                        correcto.setBounds(390, 200, 50, 50);
                                        incorrecto.setBounds(390, 200, 50, 50);
                                        actividad = 7;
                                    }  
                                    case 7 ->{
                                        actualizarTexto("Identifica el tipo de función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = e²ˣ", 30, Font.BOLD, "Cambria Math", 150, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 8;
                                    }  
                                    case 8 ->{
                                        actualizarTexto("Identifica el tipo de función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("f(x) = log(x + 1)", 30, Font.BOLD, "Cambria Math", 100, 110, 250, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 9;
                                    }  
                                    case 9 ->{
                                        actualizarTexto("Identifica el tipo de función:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        crearLabelImagen(panel, ejercicio2Funcion, 100, 40, 500, 200);
                                        actualizarTextField(true, 120, 200, 200, 25, respuesta);
                                        correcto.setBounds(350, 185, 50, 50);
                                        incorrecto.setBounds(350, 185, 50, 50);
                                        actividad = 9;
                                        actividad = 10;
                                    }  
                                }
                            }
                            case 7->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Identifica si esto es una función "
                                                + "\ndefinida por partes:", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes, 30, 70, 500, 200);
                                        actualizarRadioButton(true, "Lo es", 18, Font.BOLD, "Calibri", 300, 140 ,90, 30, botonCorrecto);
                                        crearRadioButton("No lo es", 18, Font.BOLD, "Calibri", 300, 190 ,90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Evalúa la función definida por partes:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes2, 30, 70, 500, 200);
                                        actualizarTexto("Calcula: f(1)", 18, Font.BOLD, "Cambria Math", 90, 220 ,200, 30, ejercico);
                                        actualizarTextField(true, 290, 160, 100, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Evalúa la función definida por partes:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes3, 30, 60, 500, 200);
                                        actualizarTexto("Calcula: f(4)", 18, Font.BOLD, "Cambria Math", 90, 220 ,200, 30, ejercico);
                                        actualizarTextField(true, 310, 160, 100, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Determina qué regla se usa "
                                                + "\ncuando x = –5", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes4, 20, 70, 500, 200);
                                        actualizarRadioButton(true, "x + 10", 18, Font.BOLD, "Cambria Math", 300, 140 ,90, 30, botonCorrecto);
                                        crearRadioButton("x + 6", 18, Font.BOLD, "Cambria Math", 300, 190 ,90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 4;
                                    }
                                    case 4 ->{
                                        actualizarTexto("Evalúa la función definida por partes:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes5, 20, 70, 500, 200);
                                        actualizarTexto("Calcula: f(2)", 18, Font.BOLD, "Cambria Math", 90, 220 ,200, 30, ejercico);
                                        actualizarTextField(true, 310, 160, 100, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 5;

                                    }  
                                    case 5 ->{
                                        actualizarTexto("Evalúa la función definida por partes:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes6, 30, 60, 500, 200);
                                        actualizarTexto("Calcula: f(0)", 18, Font.BOLD, "Cambria Math", 90, 220 ,200, 30, ejercico);
                                        actualizarTextField(true, 310, 150, 100, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 6;
                                    }  
                                    case 6 ->{
                                        actualizarTexto("Determina si la siguiente función"
                                                + "\nestá bien definida:", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes7, 30, 60, 500, 200);
                                        actualizarRadioButton(true, "No lo esta", 18, Font.BOLD, "Calibri", 300, 190 , 100, 30, botonCorrecto);
                                        crearRadioButton("Lo esta", 18, Font.BOLD, "Calibri", 300, 140 , 90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);                                        
                                        actividad = 7;
                                    }  
                                    case 7 ->{
                                        actualizarTexto("Evalúa la función definida por partes:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes8, 30, 60, 500, 200);
                                        actualizarTexto("Calcula: f(-3)", 18, Font.BOLD, "Cambria Math", 90, 220 ,200, 30, ejercico);
                                        actualizarTextField(true, 310, 150, 100, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);  
                                        actividad = 8;
                                    }  
                                    case 8 ->{
                                        actualizarTexto("Determina qué regla se usa "
                                                + "\ncuando x = 1.5", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes9, 20, 70, 500, 200);
                                        actualizarRadioButton(true, "2x", 18, Font.BOLD, "Cambria Math", 320, 140 ,90, 30, botonCorrecto);
                                        crearRadioButton("x³", 18, Font.BOLD, "Cambria Math", 320, 190 ,90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 9;
                                    }  
                                    case 9 ->{
                                        actualizarTexto("Determina si lo siguiente es una "
                                                + "\nfunción por partes", 24, Font.BOLD, "Calibri", 20, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionPartes10, 20, 70, 500, 200);
                                        actualizarRadioButton(true, "Si lo es", 18, Font.BOLD, "Calibri", 300, 140 ,90, 30, botonCorrecto);
                                        crearRadioButton("No lo es", 18, Font.BOLD, "Calibri", 300, 190 ,90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 10;
                                    }  
                                }
                            }
                            case 8->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Calcula la suma de las siguientes"
                                                + "\nfunciones:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 2x+1", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 3x", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Selecciona la resta correcta de las"
                                                + "\nsiguientes funciones:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x²", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 4x", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarRadioButton(true, "x² - 4x", 18, Font.BOLD, "Cambria Math", 300, 140 ,90, 30, botonCorrecto);
                                        crearRadioButton("4x²", 18, Font.BOLD, "Cambria Math", 300, 190 ,90, 30, true, panel);
                                        crearRadioButton("x - 4x²", 18, Font.BOLD, "Cambria Math", 200, 140 ,90, 30, true, panel);
                                        crearRadioButton("-4x³", 18, Font.BOLD, "Cambria Math", 200, 190 ,90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Evalua la suma de las siguientes funciones"
                                                + "\nen el punto x = 3:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x+5", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 2x-1", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Evalua la resta de las siguientes funciones"
                                                + "\nen el punto x = 2:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x³", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = x-2", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 4;
                                    }
                                    case 4 ->{
                                        actualizarTexto("Identifica la operación:", 22, Font.BOLD, "Calibri", 40, 40, 500, 90, text);
                                        actualizarTexto("(f+g)(x) = 7x−4", 30, Font.BOLD, "Cambria Math", 100, 110, 300, 50, ejercico);
                                        actualizarRadioButton(true, "Suma", 18, Font.BOLD, "Calibri", 80, 170 ,150, 30 , botonCorrecto);
                                        crearRadioButton("Resta", 18, Font.BOLD, "Calibri", 80, 210 , 100, 30 , true, panel);
                                        crearRadioButton("Multiplicación", 18, Font.BOLD, "Calibri", 230, 170 , 180, 30 , true, panel); 
                                        crearRadioButton("Ninguna", 18, Font.BOLD, "Calibri", 230, 210 , 150, 30 , true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 5;
                                    }  
                                    case 5 ->{
                                        actualizarTexto("Selecciona la suma correcta de las"
                                                + "\nsiguientes funciones:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x²+1", 30, Font.BOLD, "Cambria Math", 40, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 2x²-3", 30, Font.BOLD, "Cambria Math", 40, 180, 200, 50);
                                        actualizarRadioButton(true, "3x² - 2", 18, Font.BOLD, "Cambria Math", 320, 140 ,90, 30, botonCorrecto);
                                        crearRadioButton("3x² - 1", 18, Font.BOLD, "Cambria Math", 320, 190 ,90, 30, true, panel);
                                        crearRadioButton("3x³ - 2", 18, Font.BOLD, "Cambria Math", 220, 140 ,90, 30, true, panel);
                                        crearRadioButton("3x³ - 1", 18, Font.BOLD, "Cambria Math", 220, 190 ,90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 6;
                                    }  
                                    case 6 ->{
                                        actualizarTexto("Selecciona la resta correcta de las"
                                                + "\nsiguientes funciones:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 5x−7", 30, Font.BOLD, "Cambria Math", 40, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = x²", 30, Font.BOLD, "Cambria Math", 40, 180, 200, 50);
                                        actualizarRadioButton(true, "−x²+5x−7", 18, Font.BOLD, "Cambria Math", 240, 120 , 150, 30, botonCorrecto);
                                        crearRadioButton("x²+5x−7", 18, Font.BOLD, "Cambria Math", 240, 160 , 150, 30, true, panel);
                                        crearRadioButton("−x²-5x−7", 18, Font.BOLD, "Cambria Math", 240, 200 , 150, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 7;
                                    }  
                                    case 7 ->{
                                        actualizarTexto("Evalua la resta de las siguientes funciones"
                                                + "\nen el punto x = 5:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 4x+6", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 2x+1", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 8;
                                    }  
                                    case 8 ->{
                                        actualizarTexto("Selecciona la suma correcta de las"
                                                + "\nsiguientes funciones:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x", 30, Font.BOLD, "Cambria Math", 40, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 2x+4", 30, Font.BOLD, "Cambria Math", 40, 180, 200, 50);
                                        actualizarRadioButton(true, "3x + 4", 18, Font.BOLD, "Cambria Math", 320, 140 ,90, 30, botonCorrecto);
                                        crearRadioButton("3x - 4", 18, Font.BOLD, "Cambria Math", 320, 190 ,90, 30, true, panel);
                                        crearRadioButton("2x - 4", 18, Font.BOLD, "Cambria Math", 220, 140 ,90, 30, true, panel);
                                        crearRadioButton("2x + 4", 18, Font.BOLD, "Cambria Math", 220, 190 ,90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 9;
                                    }  
                                    case 9 ->{
                                        actualizarTexto("Evalua la suma de las siguientes funciones"
                                                + "\nen el punto x = 2:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 2x³+10", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 5x+2", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 10;
                                    }  
                                }
                            }
                            case 9->{
                                switch(ejercicio){
                                    case 0 ->{
                                        actualizarTexto("Evalua la multiplicación de las siguientes"
                                                + "\nfunciones en el punto x = 2:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x+3", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 2x", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Selecciona la expresión de "
                                                + "\n(f·g)(x):", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x²", 30, Font.BOLD, "Cambria Math", 40, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = 5x-1", 30, Font.BOLD, "Cambria Math", 40, 180, 200, 50);
                                        actualizarRadioButton(true, "5x³ - x²", 18, Font.BOLD, "Cambria Math", 320, 140 ,90, 30, botonCorrecto);
                                        crearRadioButton("5x³ + x²", 18, Font.BOLD, "Cambria Math", 320, 190 ,95, 30, true, panel);
                                        crearRadioButton("x² + 5x", 18, Font.BOLD, "Cambria Math", 220, 140 ,90, 30, true, panel);
                                        crearRadioButton("-x² + 5x", 18, Font.BOLD, "Cambria Math", 220, 190 ,90, 30, true, panel);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Evalua la multiplicación de las siguientes"
                                                + "\nfunciones en el punto x = -1:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 4x", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = x-2", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Identifica si esto es un producto de"
                                                + "\nfunciones:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("h(x) = (x – 1)(3x + 2)", 26, Font.BOLD, "Cambria Math", 80, 110, 300, 50, ejercico);
                                        actualizarRadioButton(true, "Si es un producto", 18, Font.BOLD, "Calibri", 50, 190 ,160, 30, botonCorrecto);
                                        crearRadioButton("No es un producto", 18, Font.BOLD, "Calibri", 220 ,190, 180, 30, true, panel); 
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 4;
                                    }
                                    case 4 ->{
                                        actualizarTexto("Evalua la división de las siguientes"
                                                + "\nfunciones en el punto x = 3:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x²-1", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = x-1", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 5;
                                    }  
                                    case 5 ->{
                                        actualizarTexto("Señala el valor prohibido del dominio "
                                                + "\nde la función:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        crearLabelImagen(panel, ejercicioFuncionDivision, 40, 60, 500, 200);
                                        actualizarTextField(true, 120, 220, 200, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 6;
                                    }  
                                    case 6 ->{
                                        actualizarTexto("Evalua la división de las siguientes"
                                                + "\nfunciones en el punto x = -2:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x³", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = x", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 7;
                                    }  
                                    case 7 ->{
                                        actualizarTexto("Evalua la composición de las siguientes"
                                                + "\nfunciones en el punto x = 1:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = x⁴", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = x+4", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 8;
                                    }  
                                    case 8 ->{
                                        actualizarTexto("Encuentra (g * f)(x)", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 3x", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = x–2", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50); 
                                        actividad = 9;
                                    }  
                                    case 9 ->{
                                        actualizarTexto("Evalua la composición de las siguientes"
                                                + "\nfunciones en el punto x = 2:", 22, Font.BOLD, "Calibri", 40, 20, 500, 90, text);
                                        actualizarTexto("f(x) = 2x+1", 30, Font.BOLD, "Cambria Math", 50, 120, 200, 50, ejercico);
                                        crearTexto(panel, "g(x) = x²", 30, Font.BOLD, "Cambria Math", 50, 180, 200, 50);
                                        actualizarTextField(true, 250, 160, 140, 25, respuesta);
                                        correcto.setBounds(390, 210, 50, 50);
                                        incorrecto.setBounds(390, 210, 50, 50);
                                        actividad = 10;
                                    }  
                                }
                            }
                        }
                    }
                    case 2 ->{
                        
                    }
                    case 3 ->{
                        
                    }
                }                
            }
            case "discretas" ->{
                switch(unidad){
                    case 1->{
                        switch(leccion){
                            case 2->{
                                switch(ejercicio){
                                    case 0->{
                                        actualizarTexto("Convierte de Decimal a Binario:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("18", 30, Font.BOLD, "Cambria Math", 200, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50); 
                                        actividad = 1;
                                    }
                                    case 1 ->{
                                        actualizarTexto("Convierte de Decimal a Binario:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("47", 30, Font.BOLD, "Cambria Math", 200, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50); 
                                        actividad = 2;
                                    }
                                    case 2 ->{
                                        actualizarTexto("Convierte de Binario a Decimal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("10110₂", 30, Font.BOLD, "Cambria Math", 170, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50); 
                                        actividad = 3;
                                    }
                                    case 3 ->{
                                        actualizarTexto("Convierte de Binario a Decimal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("111001₂", 30, Font.BOLD, "Cambria Math", 160, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 4;
                                    }
                                    case 4 ->{
                                        actualizarTexto("Convierte de Binario a Decimal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("11001101₂", 30, Font.BOLD, "Cambria Math", 140, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 5;
                                    }
                                    case 5 ->{
                                        actualizarTexto("Convierte de Binario a Octal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("101111₂", 30, Font.BOLD, "Cambria Math", 160, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 6;
                                    }
                                    case 6 ->{
                                        actualizarTexto("Convierte de Binario a Octal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("11001101₂", 30, Font.BOLD, "Cambria Math", 140, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 7;
                                    }
                                    case 7 ->{
                                        actualizarTexto("Convierte de Octal a Decimal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("157₈", 30, Font.BOLD, "Cambria Math", 190, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 8;
                                    }
                                    case 8 ->{
                                        actualizarTexto("Convierte de Octal a Decimal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("321₈", 30, Font.BOLD, "Cambria Math", 190, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 9;
                                    }
                                    case 9 ->{
                                        actualizarTexto("Convierte de Octal a Binario:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("25₈", 30, Font.BOLD, "Cambria Math", 200, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 10;
                                    }
                                    case 10 ->{
                                        actualizarTexto("Convierte de Hexadecimal a Decimal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("2F₁₆", 30, Font.BOLD, "Cambria Math", 200, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 11;
                                    }
                                    case 11 ->{
                                        actualizarTexto("Convierte de Hexadecimal a Decimal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("A3₁₆", 30, Font.BOLD, "Cambria Math", 200, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 12;
                                    }
                                    case 12 ->{
                                        actualizarTexto("Convierte de Hexadecimal a Binario:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("9A₁₆", 30, Font.BOLD, "Cambria Math", 200, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 13;
                                    }
                                    case 13 ->{
                                        actualizarTexto("Convierte de Hexadecimal a Binario:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("3F7₁₆", 30, Font.BOLD, "Cambria Math", 190, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 14;
                                    }
                                    case 14 ->{
                                        actualizarTexto("Convierte de Hexadecimal a Octal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("1A₁₆", 30, Font.BOLD, "Cambria Math", 190, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 15;
                                    }
                                    case 15 ->{
                                        actualizarTexto("Convierte de Hexadecimal a Octal:", 24, Font.BOLD, "Calibri", 20, 40, 500, 90, text);
                                        actualizarTexto("9F₁₆", 30, Font.BOLD, "Cambria Math", 190, 110, 200, 50, ejercico);
                                        actualizarTextField(true, 120, 175, 200, 25, respuesta);
                                        correcto.setBounds(350, 160, 50, 50);
                                        incorrecto.setBounds(350, 160, 50, 50);
                                        actividad = 16;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        verificar.addActionListener(e -> {
            if(botonCorrecto.isSelected())
                respuesta.setText("correcto");
            
            int cambiarNombre = verificarEjercicios(respuesta, actividad, curso, leccion, unidad);
            verificar.setEnabled(false);
            continuar.setEnabled(true);
            
            if(cambiarNombre == 1){
                leccionesCorrectas = leccionesCorrectas + 1;
                correcto.setVisible(true);
            }else if(cambiarNombre == 0)
                incorrecto.setVisible(true);
            else{
                verificar.setEnabled(true);
                continuar.setEnabled(false);
            }           
        });
        volver.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion);});    
        crearTexto(panel, null, false, true, null, 0, 20, 100, 400, 150);
    }
    public static int verificarEjercicios(JTextField ejercicio1, int ejercicio, String curso, int leccion, int unidad){
        
        String respuesta = ejercicio1.getText().trim().toLowerCase().replaceAll("\\s+", "");
        
        if (validarTexto(respuesta)) {
            JOptionPane.showMessageDialog(null, """
                Tu texto contiene caracteres o fuentes no permitidas.
                Por favor escribe usando texto normal (ASCII).""");
            return 3;
        }
        switch(curso){
            case "calculo" -> {
                switch(unidad){
                    case 1 -> {
                        switch(leccion){
                            case 1 -> {
                                switch(ejercicio){
                                    case 1 ->{
                                        if(!(respuesta.equals("fraccionario") || respuesta.equals("racional")))
                                            return 0;
                                    }
                                    case 2 ->{
                                        if(!(respuesta.equals("enteros") || respuesta.equals("racional") || respuesta.equals("cero"))) 
                                            return 0;
                                    }
                                    case 3 ->{
                                        if(!(respuesta.equals("enteros negativos") || respuesta.equals("racional") || respuesta.equals("enteros")))
                                            return 0;
                                    }
                                    case 4 ->{
                                        if(!(respuesta.equals("racional") || respuesta.equals("fraccionario")))
                                            return 0;
                                    }
                                    case 5 ->{
                                        if(!(respuesta.equals("irracional")))
                                            return 0;
                                    }
                                    case 6 ->{
                                        if(!(respuesta.equals(">")))
                                            return 0;
                                    }
                                    case 7 ->{
                                        if(!(respuesta.equals("<")))
                                            return 0;
                                    }
                                    case 8 ->{
                                        if(!(respuesta.equals(">")))
                                            return 0;
                                    }
                                    case 9 ->{
                                        if(!(respuesta.equals(">")))
                                            return 0;
                                    }
                                    case 10 ->{
                                        if(!(respuesta.equals("=")))
                                            return 0;
                                    }
                                    case 11 ->{
                                        if(!(respuesta.equals("irracional")))
                                            return 0;
                                    }
                                    case 12 ->{
                                        if(!(respuesta.equals("racional")))
                                            return 0;
                                    }
                                    case 13 ->{
                                        if(!(respuesta.equals("irracional")))
                                            return 0;
                                    }
                                    case 14 ->{
                                        if(!(respuesta.equals("racional")))
                                            return 0;
                                    }
                                    case 15 ->{
                                        if(!(respuesta.equals("irracional")))
                                            return 0;
                                    }
                                }      
                            }
                            case 2 -> {
                                respuesta = respuesta.replace("≤", "<=").replace("≥", ">=").replace(curso, respuesta).replace("−", "-");
                                switch(ejercicio){
                                    case 1 ->{
                                        if(!(respuesta.equals("-2<=x<5")))
                                            return 0;
                                    }
                                    case 2, 3, 5, 6, 7, 9, 13, 14, 15->{
                                        if(!(respuesta.equals("correcto")))
                                            return 0;
                                    }
                                    case 4 ->{
                                        if(!(respuesta.equals("[-4,10]")))
                                            return 0;
                                    }  
                                    case 8 ->{
                                        if(!(respuesta.equals("x<0")|| respuesta.equals("0>x")))
                                            return 0;
                                    }  
                                    case 10 ->{
                                        if(!(respuesta.equals("(-3,2]")))
                                            return 0;
                                    }
                                    case 11 ->{
                                        if(!(respuesta.equals("semicerrado")||respuesta.equals("semiabierto")))
                                            return 0;
                                    }
                                    case 12 ->{
                                        if(!(respuesta.equals("1<x<6")))
                                            return 0;
                                    }  
                                }
                            }
                            case 3 -> {
                                switch(ejercicio){
                                    case 1 ->{
                                        if(!(respuesta.equals("y") || respuesta.equals("f(x)")))
                                            return 0;

                                    }
                                    case 2,3,5,7 ->{
                                        if(!(respuesta.equals("correcto")))
                                            return 0;
                                    }
                                    case 4 ->{
                                        if(!(respuesta.equals("1")))
                                            return 0;
                                    } 
                                    case 6 ->{
                                        if(!(respuesta.equals("x")))
                                            return 0;
                                    }
                                    case 8 ->{
                                        if(!(respuesta.equals("10")))
                                            return 0;
                                    }
                                    case 9 ->{
                                        if(!(respuesta.equals("21")))
                                            return 0;
                                    }
                                    case 10 ->{
                                        if(!(respuesta.equals("24")))
                                            return 0;
                                    }
                                    
                                }
                            }
                            case 4 -> {
                                switch(ejercicio){
                                    case 1 ->{
                                        if(!(respuesta.equals("-3")))
                                            return 0;
                                    }
                                    case 2 ->{
                                        if(!(respuesta.equals("5")))
                                            return 0;
                                    }
                                    case 3 ->{
                                        if(!(respuesta.equals("-7")))
                                            return 0;
                                    }
                                    case 4 ->{
                                        if(!(respuesta.equals("representación verbal") || respuesta.equals("representacion verbal") || respuesta.equals("verbal") ))
                                            return 0;
                                    }  
                                    case 5,6,8,9->{
                                        if(!(respuesta.equals("correcto")))
                                            return 0;
                                    }
                                    case 7 ->{
                                        if(!(respuesta.equals("f(x)=7x")))
                                            return 0;
                                    }
                                    case 10 ->{
                                        if(!(respuesta.equals("f(x)=x-5")))
                                            return 0;
                                    }
                                }
                            }
                            case 5 -> {
                                switch(ejercicio){
                                    case 1, 7, 8, 10->{
                                        if(!(respuesta.equals("polinomial") || respuesta.equals("algebraica")))
                                            return 0;
                                    }
                                    case 2, 3, 4, 5, 9->{
                                        if(!(respuesta.equals("correcto")))
                                            return 0;
                                    }
                                }
                            }
                            case 6 -> {
                                switch(ejercicio){
                                    case 1, 9 ->{
                                        if(!(respuesta.equals("logaritmica")))
                                            return 0;
                                    }
                                    case 2, 6, 7->{
                                        if(!(respuesta.equals("correcto")))
                                            return 0;
                                    }
                                    case 3, 8 ->{
                                        if(!(respuesta.equals("exponencial")))
                                            return 0;
                                    }
                                    case 4 ->{
                                        if(!(respuesta.equals("trascendente")))
                                            return 0;
                                    }  
                                    case 5 ->{
                                        if(!(respuesta.equals("trigonometrica") || (respuesta.equals("trascendente"))))
                                            return 0;
                                    }
                                    case 10 ->{
                                        if(!(respuesta.equals("racional")))
                                                return 0;
                                    }
                                }
                            }
                            case 7 -> {
                                switch(ejercicio){
                                    case 1, 4, 7, 9, 10->{
                                        if(!(respuesta.equals("correcto")))
                                            return 0;
                                    }
                                    case 2 ->{
                                        if(!(respuesta.equals("3")))
                                            return 0;
                                    }
                                    case 3 ->{
                                        if(!(respuesta.equals("9")))
                                            return 0;
                                    }
                                    case 5 ->{
                                        if(!(respuesta.equals("4")))
                                            return 0;
                                    }  
                                    case 6 ->{
                                        if(!(respuesta.equals("-2")))
                                            return 0;
                                    }  
                                    case 8 ->{
                                        if(!(respuesta.equals("7")))
                                            return 0;
                                    }  
                                }
                            }
                            case 8 -> {
                                switch(ejercicio){
                                    case 1 ->{
                                        if(!(respuesta.equals("5x+1")||(respuesta.equals("1+5x")||respuesta.equals("1+x5")||respuesta.equals("x5+1") )))
                                            return 0;
                                    }
                                    case 2, 5, 6, 7, 9 ->{
                                        if(!(respuesta.equals("correcto")))
                                            return 0;
                                    }
                                    case 3 ->{
                                        if(!(respuesta.equals("13")))
                                            return 0;
                                    }
                                    case 4 ->{
                                        if(!(respuesta.equals("8")))
                                            return 0;
                                    }
                                    case 8 ->{
                                        if(!(respuesta.equals("15")))
                                            return 0;
                                    }
                                    case 10 ->{
                                        if(!(respuesta.equals("38")))
                                            return 0;
                                    }
                                }
                            }
                            case 9 -> {
                                switch(ejercicio){
                                    case 1 ->{
                                        if(!(respuesta.equals("20")))
                                            return 0;
                                    }
                                    case 2, 4 ->{
                                        if(!(respuesta.equals("correcto")))
                                            return 0;
                                    }
                                    case 3 ->{
                                        if(!(respuesta.equals("12")))
                                            return 0;
                                    }
                                    case 5, 6, 7 ->{
                                        if(!(respuesta.equals("4")))
                                            return 0;
                                    }   
                                    case 8 ->{
                                        if(!(respuesta.equals("25")))
                                            return 0;
                                    }
                                    case 9 ->{
                                        if(!(respuesta.equals("3x-2")))
                                            return 0;
                                    }
                                    case 10 ->{
                                        if(!(respuesta.equals("9")))
                                            return 0;
                                    }
                                }
                            }
                            
                        }
                    }
                }
            }
            case "discretas" -> {
                switch(unidad){
                    case 1 -> {
                        switch(leccion){
                            case 2 -> {
                                switch(ejercicio){
                                    case 1->{
                                        if(!(respuesta.equals("10010")))
                                            return 0;
                                    }
                                    case 2 ->{
                                        if(!(respuesta.equals("101111")))
                                            return 0;
                                    }
                                    case 3 ->{
                                        if(!(respuesta.equals("22")))
                                            return 0;
                                    }
                                    case 4, 6 ->{
                                        if(!(respuesta.equals("57")))
                                            return 0;
                                    }
                                    case 5, 7 ->{
                                        if(!(respuesta.equals("205")))
                                            return 0;
                                    }
                                    case 8 ->{
                                        if(!(respuesta.equals("111")))
                                            return 0;
                                    }
                                    case 9 ->{
                                        if(!(respuesta.equals("209")))
                                            return 0;
                                    }
                                    case 10 ->{
                                        if(!(respuesta.equals("010101")))
                                            return 0;
                                    }
                                    case 11 ->{
                                        if(!(respuesta.equals("47")))
                                            return 0;
                                    }
                                    case 12 ->{
                                        if(!(respuesta.equals("163")))
                                            return 0;
                                    }
                                    case 13 ->{
                                        if(!(respuesta.equals("10011010")))
                                            return 0;
                                    }
                                    case 14 ->{
                                        if(!(respuesta.equals("001111110111")))
                                            return 0;
                                    }
                                    case 15 ->{
                                        if(!(respuesta.equals("32")))
                                            return 0;
                                    }
                                    case 16 ->{
                                        if(!(respuesta.equals("237")))
                                            return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }
    public static void finalizarEjercicios(String curso,int unidad, int leccion, int cantidad, int rango){
        frameTamaño(360,350, "Learnify(Acabaste)");
        JPanel finalizar = crearPanel(true, "terminar");
        JTextArea text = crearTexto(finalizar, null, false, false, null, 0, 0, 0, 0, 0);
        crearTexto(finalizar, leccionesCorrectas + " / " + cantidad + " correctas", 40, Font.BOLD, "Calibri", 50, 100, 500, 100);           
        JButton volver = crearBotones("Volver", false, null, 120, 200, 100, 40, finalizar);
    
        if(leccionesCorrectas == cantidad)
            actualizarTexto("¡Lo hiciste perfecto!", 40, Font.BOLD, "Calibri", 5, 40, 500, 100, text);
        else if(leccionesCorrectas == cantidad - 1)
            actualizarTexto("¡Muy bien!", 40, Font.BOLD, "Calibri", 75, 40, 500, 100, text);        
        else if(leccionesCorrectas <= cantidad - 2){
            actualizarTexto("¡Sigue practicando!", 40, Font.BOLD, "Calibri", 10, 40, 500, 100, text);
            JButton reintentar = crearBotones("Reintentar", false, null, 120, 180, 100, 40, finalizar);
            volver.setBounds(120, 240, 100, 40);
            reintentar.addActionListener(e -> {botonesAccion(curso, unidad, 1, leccion, cantidad, rango);});
        }
        volver.addActionListener(e -> {
            leccionesCorrectas = 0;
            botonesAccion(curso, unidad, 2, unidad);}
        );
    }
    //Simplificar acciones
    public static boolean validarTexto(String texto){
        for (char caracter : texto.toCharArray()) {
            //Caracteres especiales permitidos
            if (caracter == '≤' || caracter == '≥' || caracter == '−') 
                continue; 
            //Fuente normal
            if (caracter >= 32 && caracter <= 126) 
                continue;            
            // Si no está en el rango de la fuente estándar mostrara mensaje
            return true;
        }

        return false;
    }
    public static void botonesAccion(String curso, int unidad, int accion, int subaccion, int accionExtra, int otraAccion){
        switch(curso){
            case "calculo" ->{
                switch(accion){
                    case 1 ->{
                        crearEjerciciosPanel(curso, unidad, subaccion, accionExtra, otraAccion);
                        layout.show(panelPrincipal, "ejercicios");
                    }
                }
            }
            case "discretas" ->{
                switch(accion){
                    case 1 ->{
                        crearEjerciciosPanel(curso, unidad, subaccion, accionExtra, otraAccion);
                        layout.show(panelPrincipal, "ejercicios");
                    }
                }
            }
        }
    }
    public static void botonesAccion(String curso, int unidad, int accion, int subaccion){
        if(curso.equals("calculo")){
            if(accion == 1){//Cambiar pestañas + Acciones
                crearInformacion(curso, unidad, subaccion);
                layout.show(panelPrincipal, "informacion");
            }else if(accion == 2){
                unidadesGeneral(subaccion, 1);
                layout.show(panelPrincipal, "calculoUnidades");
            }
        }else if(curso.equals("discretas")){
           if(accion == 1){
                crearInformacion(curso, unidad, subaccion);
                layout.show(panelPrincipal, "informacion");
            }else if(accion == 2){
                unidadesGeneral(subaccion, 2);
                layout.show(panelPrincipal, "calculoUnidades");
            }
        }
    }
    public static void botonesAccion(int accion, int subaccion){
         if(accion == 0){ //SALIR PROGRAMA
            System.exit(0);
            
        }else if(accion == 1){  //Cambiar pestañas y/o Volver (Simple)
            crearSeccionTemas();
            layout.show(panelPrincipal, "temas");
        }else if(accion == 2){
            dentroSecciones(subaccion);
            layout.show(panelPrincipal, "secciones");
        }
        
    }
    public static JLabel crearLabelImagen(JPanel panel, Icon ejercicio, int x, int y, int largo, int altura){
        JLabel imagen = new JLabel();
        imagen.setIcon(ejercicio);
        imagen.setBounds(x, y, largo, altura);
        panel.add(imagen);
        return imagen;
    }
    public static ImageIcon crearImagen(String directorio, int x, int y){
        ImageIcon imagenOriginal = new ImageIcon(Learnify.class.getResource(directorio));
        Image img = imagenOriginal.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH);
        ImageIcon escalada = new ImageIcon(img);
        return escalada;
    }
    public static void agregarTexto(StyledDocument doc, String texto, AttributeSet estilo){
        try {
            doc.insertString(doc.getLength(), texto, estilo);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
    public static SimpleAttributeSet crearEstiloTxt(String fuente, int tamaño, boolean bold, boolean italic, Color color){
        SimpleAttributeSet estilo = new SimpleAttributeSet();
        StyleConstants.setFontFamily(estilo, fuente);
        StyleConstants.setFontSize(estilo, tamaño);
        StyleConstants.setBold(estilo, bold);
        StyleConstants.setItalic(estilo, bold);
        StyleConstants.setForeground(estilo, color);
        
        return estilo;
    }
    
    public static void actualizarTexto(String texto,int tamañoLetra, int estilo, String tipoLetra, int x, int y, int largo, int altura, JLabel label ){
        label.setText(texto);
        label.setFont(new Font(tipoLetra, estilo, tamañoLetra));
        label.setBounds(x, y, largo, altura);
    }
    public static void actualizarTexto(String texto,int tamañoLetra, int estilo, String tipoLetra, int x, int y, int largo, int altura, JTextArea label ){
        label.setText(texto);
        label.setFont(new Font(tipoLetra, estilo, tamañoLetra));
        label.setBounds(x, y, largo, altura);
    }
    public static void actualizarTextField(boolean visible, int x, int y, int largo, int altura, JTextField respuesta){
        respuesta.setBounds(x, y, largo, altura);
        respuesta.setVisible(visible);
    }
    public static void actualizarRadioButton(boolean visible, String text, int tamañoLetra ,int estilo ,String tipoLetra, int x, int y, int largo, int altura, JRadioButton respuesta){
        respuesta.setText(text);
        respuesta.setBounds(x, y, largo, altura);
        respuesta.setFont(new Font(tipoLetra, estilo, tamañoLetra));
        respuesta.setVisible(visible);
    }
//Simplificar SWING
    public static void limpiarPaneles(JPanel panel){
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
        panel.setLayout(null);
    }
    public static void frameTamaño(int x, int y, String titulo){
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelPrincipal);
        frame.setSize(x, y);
        frame.setTitle(titulo);
        frame.setLocationRelativeTo(null);
    }
    public static JLabel crearTexto(JPanel panel){
        JLabel text = new JLabel();
        panel.add(text);
        return text;
        
    }
    public static void crearTexto(JPanel panel, String texto,int tamañoLetra ,int estilo ,String tipoLetra, int x, int y, int largo, int altura){
        JLabel text = new JLabel(texto);
        text.setFont(new Font(tipoLetra, estilo, tamañoLetra));
        text.setBounds(x, y, largo, altura);
        panel.add(text);
    }
    public static JTextArea crearTexto(JPanel panel, String text, boolean editable, boolean fondo, String tipoLetra, int tamañoLetra, int x, int y, int largo, int  altura){
        JTextArea label = new JTextArea(text);
        label.setEnabled(editable);
        label.setDisabledTextColor(Color.BLACK);
        label.setOpaque(fondo);
        label.setLineWrap(true);
        label.setWrapStyleWord(true);
        label.setFont(new Font(tipoLetra, Font.BOLD, tamañoLetra));
        label.setBounds(x, y, largo, altura);
        panel.add(label);
        return label;
    }
    public static JButton crearBotones(String txt,boolean tooltip, String textTooltip, int x, int y, int largo, int altura, JPanel panel){
        JButton boton = new JButton(txt);
        if(tooltip)
            boton.setToolTipText(textTooltip);
        boton.setBounds(x, y, largo, altura);
        panel.add(boton);
        return boton;
    }
    public static JPanel crearPanel(boolean añadir, String txt){
        JPanel panel =  new JPanel();
        panel.setLayout(null);
        if(añadir)
            panelPrincipal.add(panel, txt);
        return panel;
    }
    public static JTextField crearAreaRespuesta(JPanel panel, int x, int y, int largo, int altura, boolean visible){
        JTextField respuesta = new JTextField();
        respuesta.setBounds(x, y, largo, altura);
        respuesta.setHorizontalAlignment(JTextField.CENTER);
        respuesta.setFont(new Font("Open Sans", Font.PLAIN, 18));
        respuesta.setVisible(visible);
        panel.add(respuesta);
        return respuesta;
    }
    public static JRadioButton crearRadioButton(String text, int tamañoLetra ,int estilo ,String tipoLetra, int x, int y, int largo, int alto , boolean visible, JPanel panel){
        JRadioButton opcion = new JRadioButton(text);
        opcion.setBounds(x, y, largo, alto);
        opcion.setFont(new Font(tipoLetra, estilo, tamañoLetra));
        opcion.setBackground(Color.white);
        grupo.add(opcion);
        panel.add(opcion);
        opcion.setVisible(visible);
        return opcion;
    }
}