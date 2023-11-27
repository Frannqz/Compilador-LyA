package Analizador;

import java.awt.Color;
import java.awt.Desktop;
import compilerTools.Directory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Lincode
 */
public class FrmAnalizador extends javax.swing.JFrame {
    private Directory directorio;

    public FrmAnalizador() {
        initComponents();
        directorio = new Directory(this, Resultado, "Proyecto Final", ".lincode");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAnalisis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        BotonSintactico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        Borrar2 = new javax.swing.JButton();
        IMGTecnm1 = new javax.swing.JLabel();
        IMGTecCelaya = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Analisis = new javax.swing.JLabel();
        btnBorrarCodigo = new javax.swing.JButton();
        Salida1 = new javax.swing.JLabel();
        BotonSemantico = new javax.swing.JButton();
        jScrollTablaId = new javax.swing.JScrollPane();
        jTableID = new javax.swing.JTable();
        Identificadores = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        MenuArchivos = new javax.swing.JMenu();
        PDFLexico = new javax.swing.JMenuItem();
        PDFSintactico = new javax.swing.JMenuItem();
        PDFSemantico = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        ManualUsuario = new javax.swing.JMenuItem();
        Documentacion = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        Integrantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAnalisis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonAnalisis.setText("Análisis Léxico");
        BotonAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalisisActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        BotonSintactico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonSintactico.setText("Análisis Sintático");
        BotonSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSintacticoActionPerformed(evt);
            }
        });

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        Borrar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Borrar2.setText("Borrar");
        Borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar2ActionPerformed(evt);
            }
        });

        IMGTecnm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/TecNM.png"))); // NOI18N

        IMGTecCelaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/ITCelaya.png"))); // NOI18N

        Titulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        Titulo.setText("Lenguajes y Autómatas II");

        Analisis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Analisis.setText("Ejecución de Análisis");

        btnBorrarCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrarCodigo.setText("Borrar Codigo");
        btnBorrarCodigo.setActionCommand("Borrar Código");
        btnBorrarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCodigoActionPerformed(evt);
            }
        });

        Salida1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Salida1.setText("Salida:");

        BotonSemantico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonSemantico.setText("Análisis Semántico");
        BotonSemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSemanticoActionPerformed(evt);
            }
        });

        jTableID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Token", "Línea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollTablaId.setViewportView(jTableID);

        Identificadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Identificadores.setText("Generación de Token´s");

        Archivo.setText("Archivo");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        Archivo.add(Nuevo);

        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Archivo.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Archivo.add(Guardar);

        Menu.add(Archivo);

        MenuArchivos.setText("Archivos de Análisis");

        PDFLexico.setText("Análisis Léxico");
        PDFLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFLexicoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFLexico);

        PDFSintactico.setText("Analisis Sintáctico");
        PDFSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFSintacticoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFSintactico);

        PDFSemantico.setText("Analisis Semántico");
        PDFSemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFSemanticoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFSemantico);

        Menu.add(MenuArchivos);

        MenuAyuda.setText("Ayuda");

        ManualUsuario.setText("Manual de Usuario");
        ManualUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualUsuarioActionPerformed(evt);
            }
        });
        MenuAyuda.add(ManualUsuario);

        Documentacion.setText("Ejemplos Programas");
        Documentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentacionActionPerformed(evt);
            }
        });
        MenuAyuda.add(Documentacion);

        Menu.add(MenuAyuda);

        About.setText("Acerca de");

        Integrantes.setText("Integrantes");
        Integrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntegrantesActionPerformed(evt);
            }
        });
        About.add(Integrantes);

        Menu.add(About);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnBorrarCodigo)
                        .addGap(397, 397, 397)
                        .addComponent(Identificadores))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Salida1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(Borrar2)))))
                                .addGap(41, 41, 41)
                                .addComponent(jScrollTablaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(IMGTecnm1)
                                            .addGap(23, 23, 23))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(106, 106, 106)
                                                    .addComponent(Analisis))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(41, 41, 41)
                                                    .addComponent(BotonAnalisis)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(BotonSintactico)))
                                            .addGap(9, 9, 9)))
                                    .addComponent(BotonSemantico))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(478, 478, 478)
                                    .addComponent(Titulo))))
                        .addGap(18, 18, 18)
                        .addComponent(IMGTecCelaya)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IMGTecCelaya))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(IMGTecnm1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(Titulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Analisis)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonSemantico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnBorrarCodigo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Identificadores)
                                .addGap(13, 13, 13)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollTablaId, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(Salida1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(Borrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) Resultado.getText();
        Lexico lexicos = new Lexico(new StringReader(expr));
        //String resultado = "NO. LINEA \t\tSIMBOLO\nLINEA " + cont + "\n";
        String resultado = "";
        while (true) {
            Tokens token = lexicos.yylex();
            if (token == null) {
               txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
               /*case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case STRING_LITERAL:
                    resultado += "  <Cadena>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Comilla_simple:
                    resultado += "  <Comilla simple>\t" + lexicos.lexemas + "\n";
                    break;
                case _String:
                    resultado += "  <Tipo de dato String>\t" + lexicos.lexemas + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexicos.lexemas + "\n";
                    break;
                case Int:
                    resultado += "  <Tipo de dato int>\t" + lexicos.lexemas + "\n";
                    break;
                case Double:
                    resultado += "  <Tipo de dato double>\t" + lexicos.lexemas + "\n";
                    break;
                case Float:
                    resultado += "  <Tipo de dato float>\t" + lexicos.lexemas + "\n";
                    break;
                case Bool:
                    resultado += "  <Tipo de dato bool>\t" + lexicos.lexemas + "\n";
                    break;
                case Byte:
                    resultado += "  <Tipo de dato byte>\t" + lexicos.lexemas + "\n";
                    break;
                case Long:
                    resultado += "  <Tipo de dato long>\t" + lexicos.lexemas + "\n";
                    break;
                case Scanf:
                    resultado += "  <Reservado Scanf>\t" + lexicos.lexemas + "\n";
                    break;
                case Printf:
                    resultado += "  <Reservado Printf>\t" + lexicos.lexemas + "\n";
                    break;
                case Short:
                    resultado += "  <Tipo de dato short>\t" + lexicos.lexemas + "\n";
                    break;
                case Char:
                    resultado += "  <Tipo de dato char>\t" + lexicos.lexemas + "\n";
                    break;
                case Incremento:
                    resultado += "  <Incremento>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Decremento:
                    resultado += "  <Decremento>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexicos.lexemas + "\n";
                    break;
                case Endl:
                    resultado += "  <Salto de linea>\t" + lexicos.lexemas + "\n";
                    break;
                case Return:
                    resultado += "  <Reservada return>\t" + lexicos.lexemas + "\n";
                    break;
                case Void:
                    resultado += "  <Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Typedef:
                    resultado += "  <Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Switch:
                    resultado += "  <Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexicos.lexemas + "\n";
                    break;
                case For:
                    resultado += "  <Reservada for>\t" + lexicos.lexemas + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexicos.lexemas + "\n";
                    break;
                case O_logico:
                    resultado += "  <Operador o logico>\t" + lexicos.lexemas + "\n";
                    break;
                case BitOr:
                    resultado += "  <Operador bitor>\t" + lexicos.lexemas + "\n";
                    break;
                case Y_logico:
                    resultado += "  <Operador y logico>\t" + lexicos.lexemas + "\n";
                    break;
                case BitAnd:
                    resultado += "  <Operador bitand>\t" + lexicos.lexemas + "\n";
                    break;

                case Suma:
                    resultado += "  <Operador suma>\t" + lexicos.lexemas + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexicos.lexemas + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexicos.lexemas + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexicos.lexemas + "\n";
                    break;
                case ModuloIgual:
                    resultado += "  <Operador modulo igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Modulo:
                    resultado += "  <Operador modulo>\t" + lexicos.lexemas + "\n";
                    break;
                case Diferente:
                    resultado += "  <Comparador diferente>\t" + lexicos.lexemas + "\n";
                    break;
                case Negador:
                    resultado += "  <Operador de negacion>\t" + lexicos.lexemas + "\n";
                    break;
                case DobleMayor:
                    resultado += "  <Doble mayor>\t" + lexicos.lexemas + "\n";
                    break;
                case DobleMenor:
                    resultado += "  <Doble menor>\t" + lexicos.lexemas + "\n";
                    break;
                case MayorQue:
                    resultado += "  <Simbolo Mayor que>\t" + lexicos.lexemas + "\n";
                    break;
                case MenorQue:
                    resultado += "  <Simbolo Menor que>\t" + lexicos.lexemas + "\n";
                    break;
                case MayorIgual:
                    resultado += "  <Mayor igual>\t\t" + lexicos.lexemas + "\n";
                    break;
                case MenorIgual:
                    resultado += "  <Menor igual>\t\t" + lexicos.lexemas + "\n";
                    break;
                case MasIgual:
                    resultado += "  <Mas igual>\t\t" + lexicos.lexemas + "\n";
                    break;
                case MenosIgual:
                    resultado += "  <Menos igual>\t\t" + lexicos.lexemas + "\n";
                    break;
                case MultiplicacionIgual:
                    resultado += "  <Multiplica igual>\t" + lexicos.lexemas + "\n";
                    break;
                case DivisionIgual:
                    resultado += "  <Division igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Parent_a:
                    resultado += "  <Parentesis de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Parent_c:
                    resultado += "  <Parentesis de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexicos.lexemas + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexicos.lexemas + "\n";
                    break;
                case Cin:
                    resultado += "  <Entrada por consola>\t" + lexicos.lexemas + "\n";
                    break;
                case Cout:
                    resultado += "  <Salida por consola>\t" + lexicos.lexemas + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexicos.lexemas + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Coma:
                    resultado += "  <Coma>\t\t" + lexicos.lexemas + "\n";
                    break;
                case DosPuntos:
                    resultado += "  <Dos puntos>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Include:
                    resultado += "  <Reservado include>\t" + lexicos.lexemas + "\n";
                    break;
                case Std:
                    resultado += "  <Reservado std>\t" + lexicos.lexemas + "\n";
                    break;
                case Namespace:
                    resultado += "  <Reservado namespace>\t" + lexicos.lexemas + "\n";
                    break;
                case Case:
                    resultado += "  <Reservado case>\t" + lexicos.lexemas + "\n";
                    break;
                case Continue:
                    resultado += "  <Reservado continue>\t" + lexicos.lexemas + "\n";
                    break;
                case Break:
                    resultado += "  <Reservado break>\t" + lexicos.lexemas + "\n";
                    break;
                case Iostream:
                    resultado += "  <Reservado iostream>\t" + lexicos.lexemas + "\n";
                    break;
                case Using:
                    resultado += "  <Reservado using>\t" + lexicos.lexemas + "\n";
                    break;
                case Const:
                    resultado += "  <Reservado using>\t" + lexicos.lexemas + "\n";
                    break;
                case Default:
                    resultado += "  <Reservado default>\t" + lexicos.lexemas + "\n";
                    break;
                case Define:
                    resultado += "  <Reservado define>\t" + lexicos.lexemas + "\n";
                    break;
                case Unsigned:
                    resultado += "  <Reservado unsigned>\t" + lexicos.lexemas + "\n";
                    break;
                case Register:
                    resultado += "  <Reservado register>\t" + lexicos.lexemas + "\n";
                    break;
                case Struct:
                    resultado += "  <Reservado struct>\t" + lexicos.lexemas + "\n";
                    break;
                case Numeral:
                    resultado += "  <Reservado numeral>\t" + lexicos.lexemas + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexicos.lexemas + "\n";
                    break;*/
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
               /* default:
                    resultado += "  < " + lexicos.lexemas + " >\n";
                    break;*/
            }
        }

    }

    private void BotonAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalisisActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarLex.setText("Analisis Léxico realizado correctamente");
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarLex.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarLex.setForeground(Color.red);
        /*String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarLex.setText("Analisis Léxico realizado correctamente");
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarLex.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarLex.setForeground(Color.red);
        }*/
    }//GEN-LAST:event_BotonAnalisisActionPerformed

    private void Borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar2ActionPerformed
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_Borrar2ActionPerformed

    private void BotonSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSintacticoActionPerformed
        String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarLex.setText("Analisis Sintáctico realizado correctamente");
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarLex.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarLex.setForeground(Color.red);
        }
    }//GEN-LAST:event_BotonSintacticoActionPerformed

    private void btnBorrarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCodigoActionPerformed
        // TODO add your handling code here:
        Resultado.setText(null);
    }//GEN-LAST:event_btnBorrarCodigoActionPerformed

    private void BotonSemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSemanticoActionPerformed
        // TODO add your handling code here:
        String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarLex.setText("Analisis Semántico realizado correctamente");
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarLex.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarLex.setForeground(Color.red);
        }
    }//GEN-LAST:event_BotonSemanticoActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        directorio.New();
        //limpiar();
    }//GEN-LAST:event_NuevoActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        // TODO add your handling code here:
        if(directorio.Open()){
            BotonAnalisis.setEnabled(true);
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        if(directorio.Save()){
            BotonAnalisis.setEnabled(true);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void PDFLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFLexicoActionPerformed
        //        Clase Desktop es capaz de abrir e imprimir cualquier tipo de fichero con la aplicación
        //        que haya sido definida por defecto en el SO para ese tipo de fichero.
        try {
            File path = new File ("src/assets/pdf/analisis lexico.pdf");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFLexicoActionPerformed

    private void PDFSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFSintacticoActionPerformed
        try {
            File path = new File("src/assets/pdf/analisis sintactico.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFSintacticoActionPerformed

    private void PDFSemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFSemanticoActionPerformed
        try {
            File path = new File("src/assets/pdf/analisis semantico.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFSemanticoActionPerformed

    private void ManualUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualUsuarioActionPerformed
        try {
            File path = new File("");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ManualUsuarioActionPerformed

    private void DocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentacionActionPerformed
        try {
            File path = new File("");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_DocumentacionActionPerformed

    private void IntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntegrantesActionPerformed
        Integrantes aux= new Integrantes();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IntegrantesActionPerformed

    public static void main(String args[]) throws Exception {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JLabel Analisis;
    private javax.swing.JMenu Archivo;
    private javax.swing.JButton Borrar2;
    private javax.swing.JButton BotonAnalisis;
    private javax.swing.JButton BotonSemantico;
    private javax.swing.JButton BotonSintactico;
    private javax.swing.JMenuItem Documentacion;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JLabel IMGTecCelaya;
    private javax.swing.JLabel IMGTecnm1;
    private javax.swing.JLabel Identificadores;
    private javax.swing.JMenuItem Integrantes;
    private javax.swing.JMenuItem ManualUsuario;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuArchivos;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JMenuItem PDFLexico;
    private javax.swing.JMenuItem PDFSemantico;
    private javax.swing.JMenuItem PDFSintactico;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JLabel Salida1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBorrarCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollTablaId;
    private javax.swing.JTable jTableID;
    private javax.swing.JTextArea txtAnalizarLex;
    // End of variables declaration//GEN-END:variables
}
