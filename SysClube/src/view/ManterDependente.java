/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bo.ChaleBO;
import bo.ClienteBO;
import bo.DependenteBO;
import ctrl.ClienteCTRL;
import ctrl.DependenteCTRL;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import persistencia.ChaleDAO;
import persistencia.DependenteDAO;

/**
 *
 * @author Aluno
 */
public class ManterDependente extends javax.swing.JInternalFrame {

    ClienteBO clienteBo = new ClienteBO();
    DependenteBO dependenteBo = new DependenteBO();
    DependenteCTRL dependenteCtrl = new DependenteCTRL();
    String op = "";
    MaskFormatter mascaraCPF;

    private JFrame tela1;

    /**
     * Creates new form ManterDependente
     */
    public ManterDependente(JFrame tela1) {
        initComponents();
        this.tela1 = tela1;
        Util u = new Util();
        u.centralizar(this);
    }

    public ManterDependente() {
        try {
            initComponents();
            BloquearCampos();
            bt_salvar.setEnabled(false);
            bt_editar.setEnabled(false);
            txt_codigoSocio.setEditable(true);
            mascaraCPF = new MaskFormatter("###.###.###-##");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar formulário. Contate o suporte.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_novo = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_buscar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_fechar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        txt_codigoSocio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_NomeSocio = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        cmb_tipoGrau = new javax.swing.JComboBox<>();
        txt_nome = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Dependentes = new javax.swing.JTable();

        bt_novo.setText("Novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_salvar.setText("Salvar");
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        bt_buscar.setText("Buscar");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        bt_editar.setText("Editar");
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_fechar.setText("Fechar");
        bt_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecharActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Sócios"));

        jLabel1.setText("Codigo Sócio:");

        jLabel2.setText("Nome:");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txt_codigoSocio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txt_NomeSocio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_codigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NomeSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_NomeSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Dependentes"));

        jLabel3.setText("CPF:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Tipo Dependência");

        jLabel6.setText("Telefone:");

        cmb_tipoGrau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esposo(a)", "Filho(a)" }));
        cmb_tipoGrau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoGrauActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txt_documento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cmb_tipoGrau, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txt_nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txt_telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(txt_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_tipoGrau, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txt_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_tipoGrau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dependentes"));

        grid_Dependentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Tipo Dependência", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(grid_Dependentes);

        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane3)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_fechar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_novo)
                    .addComponent(bt_salvar)
                    .addComponent(bt_buscar)
                    .addComponent(bt_editar)
                    .addComponent(bt_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.getAccessibleContext().setAccessibleName("Dados Sócio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_fecharActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        op = "incluir";
        txt_codigoSocio.setEnabled(false);
        DesbloquearCampos();
        LimparCampos();
        bt_novo.setEnabled(false);
        bt_buscar.setEnabled(false);
        bt_editar.setEnabled(false);
        bt_salvar.setEnabled(true);
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        op = "alterar";
        bt_buscar.setEnabled(false);
        bt_salvar.setEnabled(true);
        bt_novo.setEnabled(false);
        bt_editar.setEnabled(false);
        DesbloquearCampos();
        txt_codigoSocio.setEditable(false);
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        DependenteBO retorno = new DependenteBO();
        
        try {
            dependenteBo.setCod_socio(Integer.parseInt(txt_codigoSocio.getText()));
            //retorno = clienteCtrl.BuscaCliente(clienteBo);

            txt_codigoSocio.setText("");
            cmb_tipoGrau.setSelectedItem("Esposo(a)");
            txt_NomeSocio.setText("");
            txt_documento.setText("");
            txt_nome.setText("");
            txt_telefone.setText("");
            bt_editar.setEnabled(true);
            
            DefaultTableModel model = (DefaultTableModel) grid_Dependentes.getModel();
            model.setNumRows(0);
            DependenteDAO obj = new DependenteDAO();
            ArrayList lista = obj.listar();

            for (int pos = 0; pos < lista.size(); pos++) {
                String[] saida = new String[4];//novo
                DependenteBO aux = (DependenteBO) (lista.get(pos));//novo
                saida[0] = aux.getNome();//novo
                saida[1] = "" + aux.getCPF();//novo
                saida[2] = aux.getGrau_dependencia();//novo
                saida[3] = "" + aux.getTelefone();//novo
                //Incluir nova linha na Tabela
                model.addRow(saida);//novo
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            LimparCampos();
        }
    
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void cmb_tipoGrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoGrauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tipoGrauActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        if ((!txt_nome.getText().equals("")) || (!txt_documento.getText().equals("")) || (!cmb_tipoGrau.getSelectedItem().equals(""))) {

            try {
                dependenteBo.setCod_socio(Integer.parseInt(txt_codigoSocio.getText()));
                dependenteBo.setNomeSocio(txt_NomeSocio.getText());
                dependenteBo.setNome(txt_nome.getText());
                dependenteBo.setCPF(Integer.parseInt(txt_documento.getText()));
                dependenteBo.setTelefone(Integer.parseInt(txt_telefone.getText()));
                
                if ("Esposo(a)".equals(cmb_tipoGrau.getSelectedItem())) {
                        dependenteBo.setGrau_dependencia("Esposo(a)");
                    } else if ("Filho(a)".equals(cmb_tipoGrau.getSelectedItem())) {
                        dependenteBo.setGrau_dependencia("Filho(a)");
                    }

                if ("incluir".equals(op)) {
                    dependenteCtrl.IncluirDependente(dependenteBo);
                }

                if ("alterar".equals(op)) {
                    dependenteCtrl.AlterarDependente(dependenteBo);
                }

                JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
                op = "";
                LimparCampos();
                DesbloquearCampos();
                txt_codigoSocio.setEnabled(true);
                bt_editar.setEnabled(false);
                bt_salvar.setEnabled(false);
                bt_buscar.setEnabled(true);  
                bt_novo.setEnabled(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "O nome, tipo e CPF/CNPJ são obrigatórios.");
        }
    }//GEN-LAST:event_bt_salvarActionPerformed

private void LimparCampos() {
        txt_codigoSocio.setText("");
        cmb_tipoGrau.setSelectedItem("Esposo(a)");
        txt_NomeSocio.setText("");
        txt_documento.setText("");
        txt_nome.setText("");
        txt_telefone.setText("");
        
    }

    private void BloquearCampos() {
        txt_codigoSocio.setEditable(false);
        cmb_tipoGrau.setEditable(false);
        txt_NomeSocio.setEditable(false);
        txt_documento.setEditable(false);
        txt_nome.setEditable(false);
        txt_telefone.setEditable(false);
    }

    private void DesbloquearCampos() {
        txt_codigoSocio.setEditable(true);
        cmb_tipoGrau.setEditable(true);
        txt_NomeSocio.setEditable(true);
        txt_documento.setEditable(true);
        txt_nome.setEditable(true);
        txt_telefone.setEditable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_fechar;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JComboBox<String> cmb_tipoGrau;
    private javax.swing.JTable grid_Dependentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_NomeSocio;
    private javax.swing.JTextField txt_codigoSocio;
    private javax.swing.JTextField txt_documento;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}