
using UnityEngine;

public class Paddle : MonoBehaviour
{
    public float speed = 10.0f;
    
    protected Rigidbody2D rigid_body; 

    private void Awake()
    {
        rigid_body = GetComponent<Rigidbody2D>();
    }
}
