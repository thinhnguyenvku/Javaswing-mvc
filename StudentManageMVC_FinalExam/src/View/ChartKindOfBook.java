/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ADMIN
 */
public class ChartKindOfBook {
     JFrame frame;

    private DefaultPieDataset dataset = new DefaultPieDataset();
    // Create a set of charts
    private JFreeChart jfreeChart;
    // Create a set of panels that can show charts
    private ChartPanel chartPanel;
    // Create a panel container
    private JPanel panel;
    /**
     * Launch the application.
     */
    

    /**
     * Create the application.
     */
    public ChartKindOfBook() {
        initialize();
        
        
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 513, 362); //set size frame
        

        //Set gia tr cho PieChart
        dataset.setValue("novel", 31);
        dataset.setValue("skills book", 24);
        dataset.setValue("foreign language book", 11);
        dataset.setValue("detective book", 16);
        dataset.setValue("love book", 12);
        dataset.setValue("other...", 9);

        jfreeChart = ChartFactory.createPieChart3D("RATE: kind of books interested young people(2019)", dataset, true, true, false);
        PiePlot3D plot = (PiePlot3D) jfreeChart.getPlot();
        plot.setForegroundAlpha((float) 0.6f);
       
        plot.setBackgroundPaint(new Color(255, 255, 255)); //Set background cho PieChart

        //panel Container chartPanel
        panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        // add chartPanel PieChart vao panel
        chartPanel = new ChartPanel(jfreeChart);
        chartPanel.setBounds(29, 36, 442, 232); //set size PieChart
        panel.add(chartPanel);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setZoomAroundAnchor(true);
        chartPanel.setBackground(SystemColor.menu);
    } 
}
