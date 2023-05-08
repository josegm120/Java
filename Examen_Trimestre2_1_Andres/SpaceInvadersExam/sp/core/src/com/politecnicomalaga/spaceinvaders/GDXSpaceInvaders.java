package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.Random;

import sun.jvm.hotspot.oops.Oop;

public class GDXSpaceInvaders extends ApplicationAdapter {

	//ESTADO
	private SpriteBatch batch;

	private Escuadron ligaDeLaJusticia;
	private Fantasma fantasma, fantasma2, fantasma3;
	//private NaveEspacial player;
	//private ArrayList<DisparoAmigo> rafagaAmiga;
	//private ArrayList<NaveEnemiga> escuadron;
	//private int pasos;
	//private int zonaDerecha;
	//private int zonaIzq;


	//COMPORTAMIENTO

	//RESTO COMPORTAMIENTOS

	//¿CONSTRUCTOR? NO TENGO, pero me dicen que create hace las veces de contructor
	@Override
	public void create () {
		int x,y;
		Random r = new Random();

		batch = new SpriteBatch();

		ligaDeLaJusticia = new Escuadron(Gdx.graphics.getWidth(),400,40,40,Gdx.graphics.getWidth()-200,"enemy.png",2.0f,8);
		fantasma = new Fantasma(r.nextInt(80)+300, r.nextInt(80)+100, 1f, 1f, "enemigo.png", 80, 80);
		fantasma2 = new Fantasma(r.nextInt(80)+300, r.nextInt(80)+100, -1f, -2f, "enemigo.png", 80, 80);
		fantasma3 = new Fantasma(r.nextInt(80)+300, r.nextInt(80)+100,-3f, 2f, "enemigo.png", 80, 80);

		//Primero se divide el ancho de la pantalla entre el numero de naves + 1.
		//Este número lo ponemos en segmento
		//Ahora se inicializa posicion a 0
		//Y repetimos : crear la nave, en la posicion += segmento tantas
		//veces como naves



		//ovni = new ObjetoVolador(r.nextInt(50)+50,r.nextInt(100)+100,0,0,"nave.png",60,60);

		//disparoVerdadero = new Disparo(100,200,0.2f,"shot.png",80,80);
	}

	@Override
	public void render () {

		Random r = new Random();

        ligaDeLaJusticia.moverse();

		fantasma.moverse();
		fantasma2.moverse();
		fantasma3.moverse();
		//dibujar despues
		ScreenUtils.clear(0f, 0f, 0f, 1);

		batch.begin();
		ligaDeLaJusticia.render(batch);

		fantasma.render(batch);
		fantasma2.render(batch);
		fantasma3.render(batch);

		batch.end();


	}
	
	@Override
	public void dispose () {
		batch.dispose();
		ligaDeLaJusticia.dispose();

		fantasma.dispose();
		fantasma2.dispose();
		fantasma3.dispose();
	}

}
