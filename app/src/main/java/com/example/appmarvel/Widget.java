package com.example.appmarvel;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import com.example.appmarvel.R;


public class Widget extends AppWidgetProvider{
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // Lógica para atualizar o conteúdo do widget
        // Aqui dá atualizar o texto do TextView, definir imagens, etc.
        for (int appWidgetId : appWidgetIds) {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
            //atualiza texto
            views.setTextViewText(R.id.textView, "Novo Texto do Widget");

            // Atualiza o widget
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }}