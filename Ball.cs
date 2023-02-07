
using UnityEngine;

public class Ball : MonoBehaviour
{
    private Rigidbody2D rigid_body; 
    public float speed = 200.0f;
    private void Awake()
    {
        rigid_body = GetComponent<Rigidbody2D>();
    }

    public void AddStartingForce()
    {
        float x = Random.value < 0.5f ? -1.0f : 1.0f; //? think of it like a coin flip if it is less then half then it goes -1 and if it is greater than half it goes 1 
         float y = Random.value < 0.5f ? Random.Range(-1.0f,-0.5f) : Random.Range(0.5f,1.0f); //if it goes in a direction less thn 0.5 then it will be Random.Range(-1.0f,-0.5f) 

        // Vector2 direction = new Vector2(x,y)
        rigid_body.AddForce(new Vector2(x,y) * this.speed);

    }
    public void ResetPosition()
    {
        rigid_body.position = Vector3.zero;
        rigid_body.velocity = Vector3.zero;

    }
    private void Start()
    {
        ResetPosition();
        AddStartingForce();
    }


    public void AddForce2(Vector2 force)
    {
        rigid_body.AddForce(force);
    }

    



}
