import java.awt.;
import java.awt.event.;
import javax.swing.;
import javax.swing.event.;

public class MyPanel extends JPanel {
private JButton recientes1_btn;
private JButton perfil_txt;
private JButton sugerido1_txt;
private JButton sugerido2_txt;
private JButton sugerido3_txt;
private JLabel jcomp6;
private JButton pqr_btn;
private JLabel logrado_num;
private JLabel pendiente_num;
private JLabel proceso_num;
private JLabel lblLogrado;
private JLabel lblPendiente;
private JLabel lblProceso;
private JButton retos_btn;
private JButton puntos_btn;
private JLabel puntos_num;
private JLabel lblGamificacion;
private JLabel lblLugaresSugeridos;
private JLabel lblSeparador1;
private JButton recientes2_btn;
private JLabel lblLugaresRecientes;
private JLabel lblAdondeVas;
private JLabel lblSeparador2;
private JLabel mapa_img;
private JLabel lblNombreUsuario;
private JLabel icono_img;
private JButton estadisticas_btn;
private JLabel viajesCompletados_num;
private JLabel lblViajesCompletados;
private JLabel co2Ahorrado_txt;
private JLabel lblco2Ahorrado;
private JLabel metro_num;
private JLabel lblBicicleta;
private JLabel lblMetro;
private JLabel lblBus;
private JLabel bicicleta_num;
private JLabel bus_num;
private JLabel lblSeparador7;
private JLabel lblSeparador6;
private JLabel lblSeparador3;
private JLabel lblSeparador4;
private JLabel lblSeparador5;

public MyPanel() {
    //construct components
    recientes1_btn = new JButton ("EAFIT");
    perfil_txt = new JButton ("Ver mas información...");
    sugerido1_txt = new JButton ("Alquiler deBicicletas");
    sugerido2_txt = new JButton ("Estacion Metro");
    sugerido3_txt = new JButton ("Parada de bus");
    jcomp6 = new JLabel ("3115170321");
    pqr_btn = new JButton ("PQR");
    logrado_num = new JLabel ("4");
    pendiente_num = new JLabel ("3");
    proceso_num = new JLabel ("2");
    lblLogrado = new JLabel ("LOGRADO");
    lblPendiente = new JLabel ("PENDIENTE");
    lblProceso = new JLabel ("PROCESO");
    retos_btn = new JButton ("RETOS");
    puntos_btn = new JButton ("PUNTOS");
    puntos_num = new JLabel ("30");
    lblGamificacion = new JLabel ("GAMIFICACION");
    lblLugaresSugeridos = new JLabel ("LUGARES SUGERIDOS");
    lblSeparador1 = new JLabel ("------------------------------------");
    recientes2_btn = new JButton ("BLENDEX");
    lblLugaresRecientes = new JLabel ("LUGARES RECIENTES");
    lblAdondeVas = new JLabel ("¿A donde vas?");
    lblSeparador2 = new JLabel ("------------------------------------");
    mapa_img = new JLabel ("imagenMapa");
    lblNombreUsuario = new JLabel ("JUAN PEREZ");
    icono_img = new JLabel ("iconoPerfil");
    estadisticas_btn = new JButton ("ESTADISTICAS");
    viajesCompletados_num = new JLabel ("4");
    lblViajesCompletados = new JLabel ("VIAJES COMPLETADOS");
    co2Ahorrado_txt = new JLabel ("15KG");
    lblco2Ahorrado = new JLabel ("CO2 AHORRADO");
    metro_num = new JLabel ("1   ");
    lblBicicleta = new JLabel ("BICICLETA");
    lblMetro = new JLabel ("METRO");
    lblBus = new JLabel ("BUS");
    bicicleta_num = new JLabel ("3");
    bus_num = new JLabel ("0");
    lblSeparador7 = new JLabel ("--------------------------------");
    lblSeparador6 = new JLabel ("---------------------------------");
    lblSeparador3 = new JLabel ("--------------------------------");
    lblSeparador4 = new JLabel ("---------------------------------");
    lblSeparador5 = new JLabel ("-------------------------------------");

    //adjust size and set layout
    setPreferredSize (new Dimension (494, 381));
    setLayout (null);

    //add components
    add (recientes1_btn);
    add (perfil_txt);
    add (sugerido1_txt);
    add (sugerido2_txt);
    add (sugerido3_txt);
    add (jcomp6);
    add (pqr_btn);
    add (logrado_num);
    add (pendiente_num);
    add (proceso_num);
    add (lblLogrado);
    add (lblPendiente);
    add (lblProceso);
    add (retos_btn);
    add (puntos_btn);
    add (puntos_num);
    add (lblGamificacion);
    add (lblLugaresSugeridos);
    add (lblSeparador1);
    add (recientes2_btn);
    add (lblLugaresRecientes);
    add (lblAdondeVas);
    add (lblSeparador2);
    add (mapa_img);
    add (lblNombreUsuario);
    add (icono_img);
    add (estadisticas_btn);
    add (viajesCompletados_num);
    add (lblViajesCompletados);
    add (co2Ahorrado_txt);
    add (lblco2Ahorrado);
    add (metro_num);
    add (lblBicicleta);
    add (lblMetro);
    add (lblBus);
    add (bicicleta_num);
    add (bus_num);
    add (lblSeparador7);
    add (lblSeparador6);
    add (lblSeparador3);
    add (lblSeparador4);
    add (lblSeparador5);

    //set component bounds (only needed by Absolute Positioning)
    recientes1_btn.setBounds (30, 65, 90, 35);
    perfil_txt.setBounds (320, 55, 165, 15);
    sugerido1_txt.setBounds (25, 190, 100, 25);
    sugerido2_txt.setBounds (25, 220, 100, 25);
    sugerido3_txt.setBounds (25, 250, 100, 25);
    jcomp6.setBounds (200, 315, 100, 25);
    pqr_btn.setBounds (175, 250, 120, 110);
    logrado_num.setBounds (200, 130, 20, 25);
    pendiente_num.setBounds (235, 165, 25, 25);
    proceso_num.setBounds (270, 125, 30, 35);
    lblLogrado.setBounds (170, 145, 60, 25);
    lblPendiente.setBounds (205, 180, 70, 20);
    lblProceso.setBounds (240, 145, 65, 25);
    retos_btn.setBounds (175, 205, 120, 30);
    puntos_btn.setBounds (175, 80, 115, 25);
    puntos_num.setBounds (225, 40, 25, 35);
    lblGamificacion.setBounds (195, 0, 90, 40);
    lblLugaresSugeridos.setBounds (20, 160, 125, 25);
    lblSeparador1.setBounds (10, 135, 150, 25);
    recientes2_btn.setBounds (30, 105, 90, 35);
    lblLugaresRecientes.setBounds (20, 35, 125, 25);
    lblAdondeVas.setBounds (35, 10, 100, 25);
    lblSeparador2.setBounds (10, 270, 150, 25);
    mapa_img.setBounds (40, 315, 100, 25);
    lblNombreUsuario.setBounds (325, 10, 95, 35);
    icono_img.setBounds (410, 15, 100, 25);
    estadisticas_btn.setBounds (335, 105, 135, 50);
    viajesCompletados_num.setBounds (400, 170, 35, 25);
    lblViajesCompletados.setBounds (335, 190, 135, 25);
    co2Ahorrado_txt.setBounds (390, 230, 30, 25);
    lblco2Ahorrado.setBounds (355, 250, 100, 25);
    metro_num.setBounds (350, 300, 20, 20);
    lblBicicleta.setBounds (380, 315, 60, 30);
    lblMetro.setBounds (330, 320, 45, 20);
    lblBus.setBounds (445, 315, 55, 30);
    bicicleta_num.setBounds (405, 295, 25, 30);
    bus_num.setBounds (450, 300, 25, 20);
    lblSeparador7.setBounds (340, 270, 130, 25);
    lblSeparador6.setBounds (335, 205, 135, 25);
    lblSeparador3.setBounds (170, 110, 130, 20);
    lblSeparador4.setBounds (170, 225, 160, 30);
    lblSeparador5.setBounds (330, 80, 150, 25);
}


public static void main (String[] args) {
    JFrame frame = new JFrame ("MyPanel");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add (new MyPanel());
    frame.pack();
    frame.setVisible (true);
}
}
