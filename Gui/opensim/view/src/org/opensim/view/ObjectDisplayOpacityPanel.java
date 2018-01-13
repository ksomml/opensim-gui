/* -------------------------------------------------------------------------- *
 * OpenSim: ObjectDisplayOpacityPanel.java                                    *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */

/*
 * ObjectDisplayOpacityPanel.java
 *
 * Created on August 14, 2007, 7:12 PM
 */

package org.opensim.view;

import java.awt.Dialog;
import java.util.Vector;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.opensim.view.nodes.OneComponentNode;
import org.opensim.view.pub.ViewDB;
import vtk.vtkProperty;

/**
 *
 * @author  erang
 */
public class ObjectDisplayOpacityPanel extends javax.swing.JPanel {
  
   final Vector<OneComponentNode> objects;
   Vector<Double> savedOpacities;
   boolean internalTrigger = false;

   /** Creates new form ObjectDisplayOpacityPanel */
   public ObjectDisplayOpacityPanel(Vector<OneComponentNode> objects) {
      this.objects = objects;

      initComponents();

      savedOpacities = new Vector<Double>(objects.size());
      for(int i=0; i<objects.size(); i++) {
         if (ViewDB.isVtkGraphicsAvailable()){
            vtkProperty prop = new vtkProperty();
            ViewDB.getInstance().getObjectProperties(objects.get(i).getOpenSimObject(), prop);
            savedOpacities.add((Double)prop.GetOpacity());
         }
         else
            savedOpacities.add(1.0);
      }

      if(objects.size()>0) {
         internalTrigger = true;
         opacitySlider.setValue((int)(savedOpacities.get(0)*100));
         internalTrigger = false;
      }
   }

   void restore() {
       if (ViewDB.isVtkGraphicsAvailable()){
            for(int i=0; i<objects.size(); i++)
               ViewDB.getInstance().setObjectOpacity(objects.get(i).getOpenSimObject(), savedOpacities.get(i));
       }
       for(int i=0; i<objects.size(); i++) {
           if (objects.get(i) instanceof ColorableInterface)
            ((ColorableInterface) objects.get(i)).setOpacity(savedOpacities.get(i));
       }
   }

   void showDialog() {
      DialogDescriptor dlg = new DialogDescriptor(this, "Select Opacity");
      dlg.setOptions(new Object[]{});
      Dialog dialog = DialogDisplayer.getDefault().createDialog(dlg);
      dialog.pack();
      dialog.setVisible(true);
   }
   
   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        opacitySlider = new javax.swing.JSlider();
        jApplyButton = new javax.swing.JButton();

        jLabel1.setText("Opacity");

        opacitySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opacitySliderStateChanged(evt);
            }
        });

        jApplyButton.setText("Apply");
        jApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApplyButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(opacitySlider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jApplyButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jApplyButton)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, opacitySlider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void opacitySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opacitySliderStateChanged
      if(internalTrigger) return;
      if (opacitySlider.getValueIsAdjusting()) return;
   }//GEN-LAST:event_opacitySliderStateChanged

    private void jApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApplyButtonActionPerformed
        // TODO add your handling code here:
        ViewDB.getInstance().setApplyAppearanceChange(false);
        double newOpacity = (double)opacitySlider.getValue()/100.0;
        for(int i=0; i<objects.size(); i++){
           if (objects.get(i) instanceof ColorableInterface)
               ((ColorableInterface) objects.get(i)).setOpacity(newOpacity);
        }
        ViewDB.getInstance().setApplyAppearanceChange(true);
    }//GEN-LAST:event_jApplyButtonActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jApplyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider opacitySlider;
    // End of variables declaration//GEN-END:variables
}
