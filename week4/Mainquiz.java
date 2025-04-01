package week4;
import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println("Selamat datang di Kuis Pengetahuan Umum!");
        System.out.println("Jawab semua pertanyaan dengan memilih nomor");

        // Looping untuk setiap pertanyaan
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Jawaban Anda: ");
            int answer = scanner.nextInt();
            quiz.checkAnswer(i, answer);
        }

        // Tampilkan skor akhir
        System.out.println("Skor akhir Anda: " + quiz.getScore());

        scanner.close();
    }
}
