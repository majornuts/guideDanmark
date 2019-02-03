package dk.mfi.guidedanmark

import android.os.AsyncTask
import android.util.Log
import com.fasterxml.jackson.core.JsonGenerationException
import com.fasterxml.jackson.core.JsonParseException
import com.fasterxml.jackson.databind.JsonMappingException
import com.google.gson.Gson
import dk.mfi.guidedanmark.model.Stamdata
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.URL


class Downloader : AsyncTask<Void, Void, String>() {

    private val TAG ="DOWNLOADER"

    override fun doInBackground(vararg params: Void?): String? {
        Log.e(TAG, "doInBackground: start ")
        val url = "https://portal.opendata.dk/dataset/44ecd686-5cb5-40f2-8e3f-b5e3607a55ef/resource/596fc0e3-7d8d-434b-a549-cb0927e8c7bc/download/guidedenmarkcphdajson.json"
        var inputSteam: InputStream? = null
        try {
            inputSteam = URL(url).openStream()
            val reader = InputStreamReader(inputSteam, "UTF-8")
            val result = Gson().fromJson(reader, Array<Stamdata>::class.java)
            Log.d(TAG,"Done")

        } catch (e: JsonGenerationException) {
            e.printStackTrace()
        } catch (e: JsonParseException) {
            e.printStackTrace()
        } catch (e: JsonMappingException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return null
    }

    override fun onPreExecute() {
        super.onPreExecute()

    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)

    }
}