package swingPros;import javax.swing.*;/*** * showInternalConfirmDialog() */public class ShowInternalConfirmationDialog {    public static void main(String[] args) {        int answer = JOptionPane.showInternalConfirmDialog(null,                "Are you Yousuf?",                "TitleBar",                JOptionPane.YES_NO_CANCEL_OPTION,                JOptionPane.QUESTION_MESSAGE);        if(answer == 0){            JOptionPane.showMessageDialog(null, "Yes, I'm Yousuf");        }        else {            JOptionPane.showMessageDialog(null, "NO");        }    }}