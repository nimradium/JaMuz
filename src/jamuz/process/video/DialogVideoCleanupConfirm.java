/*
 * Copyright (C) 2016 phramusca ( https://github.com/phramusca/JaMuz/ )
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jamuz.process.video;

import jamuz.Machine;
import jamuz.Option;
import jamuz.gui.swing.TableModel;
import jamuz.utils.Inter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author phramusca ( https://github.com/phramusca/JaMuz/ )
 */
public class DialogVideoCleanupConfirm extends javax.swing.JDialog {

	private static TableModel tableModelOptions;
	private static ArrayList<FileInfoVideo> filesToCleanup;
	/**
	 * Creates new form DialogCleanup
	 * @param parent
	 * @param modal
	 * @param filesToCleanup
	 */
	public DialogVideoCleanupConfirm(java.awt.Frame parent, boolean modal, ArrayList<FileInfoVideo> filesToCleanup) {
		super(parent, modal);
		initComponents();
		
		tableModelOptions = (TableModel) jTableOptions.getModel();
		//Set table model
		String[] columnNames = {"S", "E", ""};  //NOI18N
		Object[][] data = {
			{"Default", "Default", "Default"}  //NOI18N
		};
		tableModelOptions.setModel(columnNames, data);
		//clear the table
        tableModelOptions.clear();
		jTableOptions.setEnabled(true);
		
		//Adding columns from model. Cannot be done automatically on properties
		// as done, in initComponents, before setColumnModel which removes the columns ...
		jTableOptions.createDefaultColumnsFromModel();
		TableColumn column;
		int width = 20;
        //Set "S" column width
        column = jTableOptions.getColumnModel().getColumn(0);
		column.setMinWidth(width);
        column.setPreferredWidth(width);
		//Set "E" column width
        column = jTableOptions.getColumnModel().getColumn(1);
		column.setMinWidth(width);
        column.setPreferredWidth(width);
		DialogVideoCleanupConfirm.filesToCleanup = filesToCleanup;
		display();
		
	}
	
	public static void display() {
		jTableOptions.setRowSorter(null);
		tableModelOptions.clear();
		for(FileInfoVideo fileInfoVideo : filesToCleanup) {
			addRow(fileInfoVideo);
		}
		
		//Enable row tableSorter (cannot be done if model is empty)
		if(tableModelOptions.getRowCount()>0) {
			jTableOptions.setAutoCreateRowSorter(true);
		}
		else {
			jTableOptions.setAutoCreateRowSorter(false);
		}
		jTableOptions.setEnabled(true);
	}
	
	private static void addRow(FileInfoVideo fileInfoVideo) {
		Object[] donnee = new Object[]{fileInfoVideo.getSeasonNumber(), fileInfoVideo.getEpisodeNumber(), fileInfoVideo.getFilename() };
		tableModelOptions.addRow(donnee);
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPaneOptions = new javax.swing.JScrollPane();
        jTableOptions = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Cleanup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jTableOptions.setAutoCreateColumnsFromModel(false);
        jTableOptions.setModel(new jamuz.gui.swing.TableModel());
        jTableOptions.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPaneOptions.setViewportView(jTableOptions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 668, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPaneOptions))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //FIXME: VIDEO cleanup: add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //FIXME: VIDEO cleanup: add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

	/**
	 * @param filesToCleanup
	 */
	public static void main(ArrayList<FileInfoVideo> filesToCleanup) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DialogVideoCleanupConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(() -> {
			DialogVideoCleanupConfirm dialog = new DialogVideoCleanupConfirm(new javax.swing.JFrame(), true, filesToCleanup);
			//Center the dialog
			dialog.setLocationRelativeTo(dialog.getParent());
			dialog.setVisible(true);
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPaneOptions;
    private static javax.swing.JTable jTableOptions;
    // End of variables declaration//GEN-END:variables
}
