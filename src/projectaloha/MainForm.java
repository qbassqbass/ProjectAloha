/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectaloha;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFileChooser;

/**
 *
 * @author Jakub
 */
public class MainForm extends javax.swing.JPanel {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        initElements();
    }
    
    private void initElements(){        
        AdjustmentListener adjListener = new ScrollBarListener();
        spRawTextInfo.getVerticalScrollBar().addAdjustmentListener(adjListener);
        spTextInfo.getVerticalScrollBar().addAdjustmentListener(adjListener);
        bSave.setText("Zapisz plik");
        bSaveItem.setText("Zapisz element");
        bOpen.setText("Otwórz plik");
        taRawTextInfo.setEditable(false);
        taTextInfo.setEditable(false);
        lStatusText1.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fcFileOpen = new javax.swing.JFileChooser();
        pTree = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trMainTree = new javax.swing.JTree();
        bOpen = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        lStatusText1 = new javax.swing.JLabel();
        pProperties = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        bSaveItem = new javax.swing.JButton();
        pTextInfo = new javax.swing.JPanel();
        spTextInfo = new javax.swing.JScrollPane();
        taTextInfo = new javax.swing.JTextArea();
        spRawTextInfo = new javax.swing.JScrollPane();
        taRawTextInfo = new javax.swing.JTextArea();

        fcFileOpen.setApproveButtonToolTipText("");
        fcFileOpen.setCurrentDirectory(new java.io.File("C:\\Users\\Jakub\\Documents\\NetBeansProjects\\Kinomaniak"));
        fcFileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcFileOpenActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Object");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Movie");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("int id = 0");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("String name = \"Matrix\"");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("String genre = \"action\"");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("2");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("int id = 1");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("String name = \"Star Wars\"");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("String genre = \"sci-fi\"");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("CRoom");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("int id");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("int croom");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Show");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("int movId");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("int croomId");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        trMainTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(trMainTree);

        bOpen.setText("bOpen");
        bOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOpenActionPerformed(evt);
            }
        });

        bSave.setText("bSave");

        lStatusText1.setText("jLabel4");

        javax.swing.GroupLayout pTreeLayout = new javax.swing.GroupLayout(pTree);
        pTree.setLayout(pTreeLayout);
        pTreeLayout.setHorizontalGroup(
            pTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pTreeLayout.createSequentialGroup()
                        .addGroup(pTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pTreeLayout.createSequentialGroup()
                                .addComponent(bOpen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSave))
                            .addComponent(lStatusText1))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pTreeLayout.setVerticalGroup(
            pTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOpen)
                    .addComponent(bSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lStatusText1)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jLabel1.setText("id:");

        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("name:");

        jTextField2.setText("Matrix");

        jLabel3.setText("genre:");

        jTextField3.setText("action");

        bSaveItem.setText("bSaveItem");
        bSaveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPropertiesLayout = new javax.swing.GroupLayout(pProperties);
        pProperties.setLayout(pPropertiesLayout);
        pPropertiesLayout.setHorizontalGroup(
            pPropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPropertiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPropertiesLayout.createSequentialGroup()
                        .addGroup(pPropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPropertiesLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pPropertiesLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pPropertiesLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSaveItem)))
                .addContainerGap())
        );
        pPropertiesLayout.setVerticalGroup(
            pPropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPropertiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSaveItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        spTextInfo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spTextInfoPropertyChange(evt);
            }
        });

        taTextInfo.setColumns(20);
        taTextInfo.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        taTextInfo.setRows(5);
        spTextInfo.setViewportView(taTextInfo);

        taRawTextInfo.setColumns(20);
        taRawTextInfo.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        taRawTextInfo.setRows(5);
        spRawTextInfo.setViewportView(taRawTextInfo);

        javax.swing.GroupLayout pTextInfoLayout = new javax.swing.GroupLayout(pTextInfo);
        pTextInfo.setLayout(pTextInfoLayout);
        pTextInfoLayout.setHorizontalGroup(
            pTextInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTextInfoLayout.createSequentialGroup()
                .addComponent(spTextInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spRawTextInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pTextInfoLayout.setVerticalGroup(
            pTextInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTextInfo)
            .addComponent(spRawTextInfo)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pProperties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTextInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pProperties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTextInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bSaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSaveItemActionPerformed
    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    
    public static String bytesToHex(byte[] bytes, boolean raw){
        return bytesToHex(bytes, raw, false);
    }
    public static String bytesToHex(byte[] bytes, boolean raw, boolean rawNoNewLines) {
        String hx = new String();
        if(raw){
            for(int j = 0; j < bytes.length; j++){
                if(!rawNoNewLines) if(j % 16 == 0 && j > 0) hx += "\n";
                int v = bytes[j] & 0xFF;
                if(v < 0x0F) hx += '.';
                else
                hx += (char)v;
            }
        }else{
            for (int j = 0; j < bytes.length; j++){
                if(j % 16 == 0 && j > 0) hx += "\n";
                else if(j % 8 == 0 && j > 0) hx += "| ";
                int v = bytes[j] & 0xFF;
                hx += hexArray[v >>> 4];
                hx += hexArray[v & 0x0F];
                hx += " ";
            }
        }
        return hx;
//    return new String(hexChars);
    }
    
    private int twoByte(byte b1, byte b2){
        int i;
        i = b1;
        i = i << 8;
        i += b2;
        return i;
    }
    
    private String getType(int propType){
        switch(propType){
            case 'I':{
                return("Integer");
//                break;
            }
            case 'B':{
                return("Byte");
//                break;
            }
            case 'C':{
                return("Char");
//                break;
            }
            case 'D':{
                return("Double");
//                break;
            }
            case 'F':{
                return("Float");
//                break;
            }
            case 'J':{
                return("Long");
//                break;
            }
            case 'S':{
                return("Short");
//                break;
            }
            case 'Z':{
                return("Boolean");
//                break;
            }
            case '[':{
                return("Array of");

//                break;
            }
            case 'L':{
                return("Object");
//                break;
            }
        }
        return("Error!");
    }
    
    private void parseByteArray(byte[] bytes){
        int totalBytes = bytes.length - 1;
        int parsedBytes = 3;
        while(parsedBytes < totalBytes){
            parsedBytes++;
            switch(bytes[parsedBytes]){
                case 0x73: {
                    System.out.println("It's an object!");
                    break;
                }
                case 0x72: {
                    System.out.println("TC_CLASSDESC");
                    parsedBytes++;
                    int length = twoByte(bytes[parsedBytes], bytes[parsedBytes+1]);// should be bytes[pB+1] >> bytes[pB+2]
                    System.out.println("class name length: "+length);
                    parsedBytes += 2;
                    System.out.println("class name: "+bytesToHex(Arrays.copyOfRange(bytes, parsedBytes, parsedBytes+length), true, true));
                    parsedBytes += length;
                    System.out.println("SerialVersionUID: "+bytesToHex(Arrays.copyOfRange(bytes, parsedBytes, parsedBytes+8), false));
                    parsedBytes += 8;
                    System.out.println("Flags: "+(bytes[parsedBytes] & 0xFF));
//                    System.out.println("Parsed: "+parsedBytes);
                    parsedBytes++;
//                    System.out.println("next byte: "+bytesToHex(Arrays.copyOfRange(bytes, parsedBytes, bytes.length), false));
                    
//                    System.out.println("Parsed: "+parsedBytes);
                    int propCount = twoByte(bytes[parsedBytes], bytes[parsedBytes+1]); // like in length;
                    parsedBytes += 2;
                    System.out.println("Class properties count: "+propCount);
                    
//                    System.out.println("next byte: "+bytesToHex(Arrays.copyOfRange(bytes, parsedBytes, bytes.length), false));
                    for (int i = 0; i < propCount; i++){
                        int propType = bytes[parsedBytes];
                        parsedBytes++;
                        switch(propType){
                            case 'I':{
                                System.out.println("Integer!");
                                break;
                            }
                            case 'B':{
                                System.out.println("Byte!");
                                break;
                            }
                            case 'C':{
                                System.out.println("Char!");
                                break;
                            }
                            case 'D':{
                                System.out.println("Double!");
                                break;
                            }
                            case 'F':{
                                System.out.println("Float!");
                                break;
                            }
                            case 'J':{
                                System.out.println("Long!");
                                break;
                            }
                            case 'S':{
                                System.out.println("Short!");
                                break;
                            }
                            case 'Z':{
                                System.out.println("Boolean!");
                                break;
                            }
                            case '[':{
                                System.out.println("Array!");
                                
                                break;
                            }
                            case 'L':{
                                System.out.println("Object!");
                                break;
                            }
                        }
                        int propNameLen = twoByte(bytes[parsedBytes], bytes[parsedBytes+1]); // like in length;
                        parsedBytes += 2;
//                        ObjectStreamConstants.TC
                        System.out.println("prop name: "+bytesToHex(Arrays.copyOfRange(bytes, parsedBytes, parsedBytes+propNameLen), true, true));
                        parsedBytes += propNameLen;
                        if(propType == '['){
//                            parsedBytes++;
                            if(bytes[parsedBytes] == 0x74){
                                parsedBytes++;
                                int len = twoByte(bytes[parsedBytes], bytes[parsedBytes+1]);
                                System.out.println(len);
                                parsedBytes += 2;
//                                System.out.println("parsedBytes1: "+parsedBytes);
                                byte tmp[] = Arrays.copyOfRange(bytes, parsedBytes, parsedBytes+len);
                                System.out.println("Array type: "+bytesToHex(tmp, false));
                                System.out.print("Array type: ");
                                System.out.println(bytesToHex(tmp, true, true));
                                for(int zz = 0; zz < len; zz++){
                                    System.out.print(getType(tmp[zz])+" ");
                                }
                                System.out.println();
//                                System.out.println("parsedBytes2: "+parsedBytes);
                                parsedBytes += len-1;
//                                System.out.println("parsedBytes3: "+parsedBytes);
                            }else{
                                System.out.println("Sth goes wrong");
                            }
                        }
                    }
//                    System.out.println("next byte: "+bytesToHex(Arrays.copyOfRange(bytes, parsedBytes, bytes.length), false));
                    break;
                }
                case 0x78:{
                    System.out.println("TC_ENDBLOCKDATA");
                    break;
                }
                case 0x70:{
                    System.out.println("TC_NULL");
                    System.out.println("next byte: "+bytesToHex(Arrays.copyOfRange(bytes, parsedBytes, bytes.length), false));
                    break;
                }
            }
        }
    }
    
    
    private byte[] fileByteArray;
    private void fcFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcFileOpenActionPerformed
        int returnVal = fcFileOpen.showOpenDialog(this);
        if (returnVal != JFileChooser.APPROVE_OPTION) {
            File file = fcFileOpen.getSelectedFile();
            try {
              // What to do with the file, e.g. display it in a TextArea
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                FileInputStream fis = new FileInputStream(file);
                while(fis.available() > 0)
                    baos.write(fis.read());
                fileByteArray = baos.toByteArray();
                taTextInfo.setText(bytesToHex(fileByteArray, false));
                taRawTextInfo.setText(bytesToHex(fileByteArray, true));
//                System.out.println(bytesToHex(fileByteArray));
//              textarea.read( new FileReader( file.getAbsolutePath() ), null );
            } catch (IOException ex) {
              System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_fcFileOpenActionPerformed

    private void bOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOpenActionPerformed
        fcFileOpen.showDialog(pTree, TOOL_TIP_TEXT_KEY);
        int byte0 = fileByteArray[0] & 0xFF, byte1 = fileByteArray[1] & 0xFF;
        if(byte0 == 0xAC && byte1 == 0xED){
            lStatusText1.setText("Java Serializable");
            byte version[] = {fileByteArray[2], fileByteArray[3]};
            lStatusText1.setText(lStatusText1.getText()+":"+bytesToHex(version, false));
            parseByteArray(fileByteArray);
        }
        else lStatusText1.setText("Not Java Serializable");
//        System.out.print(byte0 + " " + byte1);
    }//GEN-LAST:event_bOpenActionPerformed

    private void spTextInfoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spTextInfoPropertyChange
    
    }//GEN-LAST:event_spTextInfoPropertyChange

    class ScrollBarListener implements AdjustmentListener{

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            int val = e.getValue();
            spRawTextInfo.getVerticalScrollBar().setValue(val);
            spTextInfo.getVerticalScrollBar().setValue(val);
//            System.out.println("Horiz: "+val);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOpen;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSaveItem;
    private javax.swing.JFileChooser fcFileOpen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lStatusText1;
    private javax.swing.JPanel pProperties;
    private javax.swing.JPanel pTextInfo;
    private javax.swing.JPanel pTree;
    private javax.swing.JScrollPane spRawTextInfo;
    private javax.swing.JScrollPane spTextInfo;
    private javax.swing.JTextArea taRawTextInfo;
    private javax.swing.JTextArea taTextInfo;
    private javax.swing.JTree trMainTree;
    // End of variables declaration//GEN-END:variables
}
