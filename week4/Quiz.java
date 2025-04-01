package week4;

public class Quiz {
    private String[] questions = {
        "Ibu kota Indonesia adalah?",
        "Hewan apa yang paling pendiam?",
        "Planet terbesar di tata surya?",
        "Siapa penemu bola lampu?",
        "Gunung tertinggi di dunia?",
        "Berapakah hasil dari 7 + 8?",
        "Apa nama samudra terbesar di dunia?",
        "Siapa presiden pertama Indonesia?",
        "Apa lambang unsur kimia untuk emas?",
        "Negara mana yang memiliki menara Eiffel?"
    };
    
    private String[][] options = {
        {"1. Jakarta", "2. Bandung", "3. Surabaya", "4. Bali"},
        {"1. Harimau", "2. Semut", "3. Gajah", "4. Kucing"},
        {"1. Mars", "2. Bumi", "3. Jupiter", "4. Saturnus"},
        {"1. Albert Einstein", "2. Thomas Edison", "3. Nikola Tesla", "4. Isaac Newton"},
        {"1. Gunung Kilimanjaro", "2. Gunung Elbrus", "3. Gunung Everest", "4. Gunung Fuji"},
        {"1. 12", "2. 14", "3. 15", "4. 16"},
        {"1. Samudra Atlantik", "2. Samudra Hindia", "3. Samudra Pasifik", "4. Samudra Arktik"},
        {"1. Soeharto", "2. Soekarno", "3. Habibie", "4. Megawati"},
        {"1. Au", "2. Ag", "3. Fe", "4. Hg"},
        {"1. Jerman", "2. Spanyol", "3. Perancis", "4. Italia"}
    };
    
    private int[] correctAnswers = {1, 2, 3, 2, 3, 3, 3, 2, 1, 3};
    private int score = 0;
    
    public int getQuestionCount() {
        return questions.length;
    }
    
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }
    
    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + 
                options[index][correctAnswers[index] - 1]);
        }
    }
    
    public int getScore() {
        return score;
    }
}
