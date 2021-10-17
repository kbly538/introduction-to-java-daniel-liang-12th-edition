/*
(Display a pie chart) Write a program that uses a pie chart to display the percentages
of the overall grade represented by projects, quizzes, midterm exams,
and the final exam, as shown in Figure 14.46c. Suppose projects take 20% and
are displayed in red, quizzes take 10% and are displayed in blue, midterm
exams
take 30% and are displayed in green, and the final exam takes 40% and is displayed
in orange. Use the Arc class to display the pies. Interested readers may
explore the JavaFX PieChart class for further study.
 */
package chapter14.javafx.exercises.Exercise_14_13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_13 extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        Pane pane = new Pane();// Project
        pane.setStyle("-fx-background-color: WHITE");


        Arc project = new Arc(150, 150, 100, 100, 0, 360 * 0.2);
        project.setType(ArcType.ROUND);
        project.setFill(Color.RED);
        project.centerXProperty().bind(pane.widthProperty().divide(2));
        project.centerYProperty().bind(pane.heightProperty().divide(2));

        // Quiz
        Arc quiz = new Arc(150, 150, 100, 100, 360 * 0.2, 360 * 0.1);
        quiz.setType(ArcType.ROUND);
        quiz.setFill(Color.BLUE);
        quiz.centerXProperty().bind(pane.widthProperty().divide(2));
        quiz.centerYProperty().bind(pane.heightProperty().divide(2));

        // Midterm
        Arc midterm = new Arc(150, 150, 100, 100, 360 * 0.3, 360 * 0.3);
        midterm.setType(ArcType.ROUND);
        midterm.setFill(Color.GREEN);
        midterm.centerXProperty().bind(pane.widthProperty().divide(2));
        midterm.centerYProperty().bind(pane.heightProperty().divide(2));

        // Final
        Arc finals = new Arc(150, 150, 100, 100, 360 * 0.6, 360 * 0.4);
        finals.setType(ArcType.ROUND);
        finals.setFill(Color.ORANGE);
        finals.centerXProperty().bind(pane.widthProperty().divide(2));
        finals.centerYProperty().bind(pane.heightProperty().divide(2));

        Text projectLabel = new Text("Project -- 20%");
        projectLabel.xProperty().bind(project.centerXProperty().add(30));
        projectLabel.yProperty().bind(project.centerYProperty().add(-30));
        projectLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));

        Text quizLabel = new Text("Quiz -- 10%");
        quizLabel.xProperty().bind(project.centerXProperty().subtract(30));
        quizLabel.yProperty().bind(project.centerYProperty().subtract(110));
        quizLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));

        Text midtermLabel = new Text("Midterm -- 30%");
        midtermLabel.xProperty().bind(project.centerXProperty().subtract(90));
        midtermLabel.yProperty().bind(project.centerYProperty().subtract(10));
        midtermLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));

        Text finalsLabel = new Text("Final -- 40%");
        finalsLabel.xProperty().bind(project.centerXProperty().subtract(10));
        finalsLabel.yProperty().bind(project.centerYProperty().add(60));
        finalsLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));


        pane.getChildren().addAll(project, quiz, midterm, finals, projectLabel, quizLabel, midtermLabel, finalsLabel);

        Scene scene = new Scene(pane, 300, 300);
        stage.setTitle("Pie Chart");
        stage.setScene(scene);
        stage.setMinWidth(300);
        stage.setMinHeight(300);
        stage.show();

    }
}
