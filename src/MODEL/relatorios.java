package MODEL;

import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class relatorios {

    public static void openReportPDFGeral(InputStream inputStream, Map parametros,
            java.sql.Connection conexao) throws JRException {

       try {
            //gera o relatório em jasper
            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, conexao);
            //gera PDF e salva no destino
            JasperExportManager.exportReportToPdfFile(print, "relatorio/relatorioGeral.pdf");
            //Visualizar o Relatorio em PDF, primeiro localiza o arquivo gerado
            File pdf = new File("relatorio/relatorioGeral.pdf");            
            try {                
                //agora abre o relatório em PDF
                Desktop.getDesktop().open(pdf);                
            } catch (Exception ex) {                
                ex.printStackTrace();                
                JOptionPane.showMessageDialog(null, "Erro Abrir o PDF " + ex);                
            }                       
        } catch (JRException ex) {
            Logger.getLogger(relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void openReportPDFEspecificoSindicalizado(InputStream inputStream, Map parametros,
            java.sql.Connection conexao) throws JRException {

       try {
            //gera o relatório em jasper
            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, conexao);
            //gera PDF e salva no destino
            JasperExportManager.exportReportToPdfFile(print, "relatorio/relatorioEspecificoSindizalizado.pdf");
            //Visualizar o Relatorio em PDF, primeiro localiza o arquivo gerado
            File pdf = new File("relatorio/relatorioEspecificoSindizalizado.pdf");            
            try {                
                //agora abre o relatório em PDF
                Desktop.getDesktop().open(pdf);                
            } catch (Exception ex) {                
                ex.printStackTrace();                
                JOptionPane.showMessageDialog(null, "Erro Abrir o PDF " + ex);                
            }                       
        } catch (JRException ex) {
            Logger.getLogger(relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void openReportPDFEspecificoConvenio(InputStream inputStream, Map parametros,
            java.sql.Connection conexao) throws JRException {

       try {
            //gera o relatório em jasper
            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, conexao);
            //gera PDF e salva no destino
            JasperExportManager.exportReportToPdfFile(print, "relatorio/relatorioEspecificoConvenio.pdf");
            //Visualizar o Relatorio em PDF, primeiro localiza o arquivo gerado
            File pdf = new File("relatorio/relatorioEspecificoConvenio.pdf");            
            try {                
                //agora abre o relatório em PDF
                Desktop.getDesktop().open(pdf);                
            } catch (Exception ex) {                
                ex.printStackTrace();                
                JOptionPane.showMessageDialog(null, "Erro Abrir o PDF " + ex);                
            }                       
        } catch (JRException ex) {
            Logger.getLogger(relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
            public static void openReportPDFContraCheque(InputStream inputStream, Map parametros,
            java.sql.Connection conexao) throws JRException {

       try {
            //gera o relatório em jasper
            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, conexao);
            //gera PDF e salva no destino
            JasperExportManager.exportReportToPdfFile(print, "relatorio/contraCheque.pdf");
            //Visualizar o Relatorio em PDF, primeiro localiza o arquivo gerado
            File pdf = new File("relatorio/contraCheque.pdf");            
            try {                
                //agora abre o relatório em PDF
                Desktop.getDesktop().open(pdf);                
            } catch (Exception ex) {                
                ex.printStackTrace();                
                JOptionPane.showMessageDialog(null, "Erro Abrir o PDF " + ex);                
            }                       
        } catch (JRException ex) {
            Logger.getLogger(relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
