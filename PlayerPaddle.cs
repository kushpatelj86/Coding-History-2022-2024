
using UnityEngine;

public class PlayerPaddle : Paddle //inheritance
{
  private Vector2 direction_;  

    private void Update()
    {
        if(Input.GetKey(KeyCode.W ) || Input.GetKey(KeyCode.UpArrow)) 
        {
            direction_ = Vector2.up;
        }
        else if(Input.GetKey(KeyCode.S ) || Input.GetKey(KeyCode.DownArrow)) 
        {
            direction_ = Vector2.down;
        }
        
        else
        {
            direction_ = Vector2.zero;

        }
    }
    private void FixedUpdate()
    {
        if(direction_.sqrMagnitude != 0)
        {
            rigid_body.AddForce(direction_ * this.speed);
        }
    }





}
