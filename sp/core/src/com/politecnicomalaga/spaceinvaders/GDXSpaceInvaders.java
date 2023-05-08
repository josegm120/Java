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
	private Fantasma casper;
	private Fantasma casper2;
	private Fantasma casper3;
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

		ligaDeLaJusticia = new Escuadron(Gdx.graphics.getWidth(),400,40,40,Gdx.graphics.getWidth()-200,"enemigo.png",2.0f,8);

		casper = new Fantasma(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2, -1.0f, -1.0f, "enemigo.png", 80, 80);
		casper2 = new Fantasma(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), Gdx.graphics.getWidth()/4, Gdx.graphics.getHeight()/2, 2.0f, 2.0f, "enemigo.png", 80, 80);
		casper3 = new Fantasma(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), Gdx.graphics.getWidth()/2+Gdx.graphics.getWidth()/4, Gdx.graphics.getHeight()/2, 3.0f, 3.0f, "enemigo.png", 80, 80);

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

		//dibujar despues
		ScreenUtils.clear(0f, 0f, 0f, 1);

		batch.begin();
		ligaDeLaJusticia.render(batch);
		batch.end();

		batch.begin();
		casper.moverse();
		casper.render(batch);
		batch.end();

		batch.begin();
		casper2.moverse();
		casper2.render(batch);
		batch.end();

		batch.begin();
		casper3.moverse();
		casper3.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		ligaDeLaJusticia.dispose();

	}
}
