package com.developer.johhns.localizacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LocationListener {

    static final long TIEMPO_MIN    = 10 * 1000 ; // 10 minutos
    static final long DISTANCIA_MIN = 5 ; // 5 metros
    static final String[] A = { "n/d","preciso","impreciso" } ;
    static final String[] P = { "n/d","bajo","medio","alto" } ;
    static final String[] E = { "fuera de servicio",
                                "temporalmente no disponible",
                                "dispobible" } ;
    LocationManager manejadorLoc ;
    String          proveedor ;
    TextView        salida ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salida = findViewById( R.id.salida ) ;
        manejadorLoc = (LocationManager) getSystemService( LOCATION_SERVICE ) ;
        muestraProveedores();
        Criteria criterio = new Criteria();
        criterio.setCostAllowed(false);
        criterio.setAltitudeRequired(false);
        criterio.setAccuracy(Criteria.ACCURACY_FINE);
        proveedor = manejadorLoc.getBestProvider(criterio,true) ;
        Location localizacion = manejadorLoc.getLastKnownLocation(proveedor);
        muestraLocaliz(localizacion);
    }

    private void muestraLocaliz(Location localizacion) {
    }

    private void muestraProveedores() {
        
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {

    }

    @Override
    public void onLocationChanged(@NonNull List<Location> locations) {

    }

    @Override
    public void onFlushComplete(int requestCode) {

    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {

    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}