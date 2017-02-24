package mx.com.onofre.alejandro.puppy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

import static mx.com.onofre.alejandro.puppy.R.id.imageButton;

public class MascotasActivity extends AppCompatActivity {


    ArrayList<Mascota> mascotas;
    private RecyclerView listadoMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Harry", R.drawable.harry, 4));
        mascotas.add(new Mascota("Larry", R.drawable.larry, 2));
        mascotas.add(new Mascota("Lasie", R.drawable.lasie, 1));
        mascotas.add(new Mascota("Lucas", R.drawable.lucas, 5));
        mascotas.add(new Mascota("Mey", R.drawable.mey, 3));
        mascotas.add(new Mascota("Pancho", R.drawable.pancho, 6));
        mascotas.add(new Mascota("Puppy", R.drawable.puppy, 5));
        mascotas.add(new Mascota("Rufy", R.drawable.rufy, 4));
        mascotas.add(new Mascota("Terrie", R.drawable.terrier, 7));
        mascotas.add(new Mascota("White", R.drawable.white, 5));

        listadoMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager lMng = new LinearLayoutManager(this);
        lMng.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager(lMng);

        MascotaAdaptador mAdaptador = new MascotaAdaptador(mascotas);
        listadoMascotas.setAdapter(mAdaptador);
/*
        ImageButton btnStar = (ImageButton) findViewById(R.id.btnEstrella);

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetail = new Intent(MascotasActivity.this, topMascotaActivity.class);

                startActivity(intentDetail);
                //finish();
            }

        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favoritos:
                Intent intentDetail = new Intent(MascotasActivity.this, topMascotaActivity.class);

                startActivity(intentDetail);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}

