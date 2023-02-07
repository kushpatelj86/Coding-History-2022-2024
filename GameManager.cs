using UnityEngine;
using UnityEngine.UI;





public class GameManager : MonoBehaviour
{

    private int player_score;
    private int computer_score;
    public Text playerScoreText;
    public Text computerScoreText;
    public Ball ball;
    public Paddle playerPaddle;
    public Paddle computerPaddle;

    

    private void ResetRound()
    {
        this.playerPaddle.ResetPosition();
        this.computerPaddle.ResetPosition();
        this.ball.ResetPosition();
        this.ball.AddStartingForce();
    }

    public void PlayerScore()
    {
        player_score++;
        this.playerScoreText.text = player_score.ToString();
        ResetRound();
    }

    public void ComputerScore()
    {
        computer_score++;
        this.computerScoreText.text = computer_score.ToString();

        ResetRound();

    }

    

}
