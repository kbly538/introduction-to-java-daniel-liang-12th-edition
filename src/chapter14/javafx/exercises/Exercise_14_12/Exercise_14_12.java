/*
(Display a bar chart) Write a program that uses a bar chart to display the
percentages of the overall grade represented by projects, quizzes, midterm
exams, and the final exam, as shown in Figure 14.46b. Suppose projects take
20% and are displayed in red, quizzes take 10% and are displayed in blue,
midterm exams take 30% and are displayed in green, and the final exam takes
40% and is displayed in orange. Use the Rectangle class to display the bars.
Interested readers may explore the JavaFX BarChart class for further study.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_12 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        double padding = 10;
        double screenWidth = 500;
        double screenHeight = 200;

        double barWidth = screenWidth * 0.25 + padding;


        Text projectLabel = new Text("Project -- 20%");
        Text quizLabel = new Text("Quiz -- 10%");
        Text midtermLabel = new Text("Midterm -- 30%");
        Text finalsLabel = new Text("Final -- 40%");


        projectLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        quizLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        midtermLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        finalsLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));

        Pane pane = new Pane();
        pane.setPadding(new Insets(20, 20, 20, 20));

        Rectangle project = new Rectangle(barWidth, screenHeight * 0.2 * 2 + padding);
        project.setFill(Color.RED);
        project.setX(padding);
        project.setY(screenHeight - screenHeight * 0.2 * 2 - padding * 2);
        projectLabel.setX(padding + barWidth / 5);
        projectLabel.setY(screenHeight - screenHeight * 0.2 * 2 - padding * 3);


        Rectangle quiz = new Rectangle(barWidth, screenHeight * 0.1 * 2 + padding);
        quiz.setFill(Color.BLUE);
        quiz.setX(barWidth * 1 + padding * 2);
        quiz.setY(screenHeight - screenHeight * 0.1 * 2 - padding * 2);
        quizLabel.setX(barWidth * 1 + padding * 2 + barWidth / 5);
        quizLabel.setY(screenHeight - screenHeight * 0.1 * 2 - padding * 3);

        Rectangle midterm = new Rectangle(barWidth, screenHeight * 0.3 * 2 + padding);
        midterm.setFill(Color.GREEN);
        midterm.setX(barWidth * 2 + padding * 3);
        midterm.setY(screenHeight - screenHeight * 0.3 * 2 - padding * 2);
        midtermLabel.setX(barWidth * 2 + padding * 3 + barWidth / 5);
        midtermLabel.setY(screenHeight - screenHeight * 0.3 * 2 - padding * 3);

        Rectangle finals = new Rectangle(barWidth, screenHeight * 0.4 * 2 + padding);
        finals.setX(barWidth * 3 + padding * 4);
        finals.setFill(Color.ORANGE);
        finals.setY(screenHeight - screenHeight * 0.4 * 2 - padding * 2);
        finalsLabel.setX(barWidth * 3 + padding * 4 + barWidth / 5);
        finalsLabel.setY(screenHeight - screenHeight * 0.4 * 2 - padding * 3);

        pane.getChildren().addAll(project, quiz, midterm, finals,
                projectLabel, quizLabel, midtermLabel, finalsLabel);
        Scene scene = new Scene(pane, screenWidth + padding * 9, screenHeight);
        stage.setTitle("Bar Chart");
        stage.setScene(scene);
        stage.show();
    }
}

