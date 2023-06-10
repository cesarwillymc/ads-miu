public class lab3 {
    static public void main(String args[]) {
        Cabinet cab = new Cabinet();
        Board board = new Board();

        Container d1 = new Drive();
        Container d2 = new Drive();
        Container d3 = new Drive();
        Container bus = new Bus();

        Container card1 = new Card();
        Container card2 = new Card();
        Container card3 = new Card();

        cab.setBoard(board);
        cab.addDrive(d1);
        cab.addDrive(d2);
        cab.addDrive(d3);

        board.setBus(bus);
        board.addCard(card1);
        board.addCard(card2);
        board.addCard(card3);

        System.out.println("Total price of computer is: " + cab.computePrice());
    }
}
